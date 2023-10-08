package com.buyukozkan.postservice;

public class Post {
    
    private String postId;
    private String title;
    private String content;

    public Post (String postId, String title, String content) {
        this.postId = postId;
        this.title = title;
        this.content = content;
    } 

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
