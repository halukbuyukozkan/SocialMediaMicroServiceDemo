package com.buyukozkan.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/user")
public class UserController {

    // it will find out the bean definition for RestTemplate and inject it.
    @Autowired
    private RestTemplate restTemplate;


    @GetMapping(value="/{userId}")
    public User getUser(@PathVariable("userId") String userId) {
        User userOne = new User(userId, "Test User" + userId, "555-555-5555" + userId );

        // Sending a rest request to post-service to get a post.
        // response will be mapped to Post class.
        Post posts = restTemplate.getForObject("http://localhost:8081/post/1", Post.class);

        userOne.setPosts(posts);

        Notification notifications = restTemplate.getForObject("http://localhost:8080/notification/1", Notification.class);

        userOne.setNotifications(notifications);

        return userOne;
    }
}
