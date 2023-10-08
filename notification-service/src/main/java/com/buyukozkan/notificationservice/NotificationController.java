package com.buyukozkan.notificationservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    @GetMapping(value = "{notificationId}")
    public Notification geNotification(@PathVariable("notificationId") String notificationId) {
        Notification notification = new Notification(notificationId, "Test Description");

        return notification;
    }
}
