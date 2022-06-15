package tdd;

import tdd.posts.PostService;
import tdd.posts.PostServiceImpl;
import tdd.users.UserService;
import tdd.users.UserServiceImpl;

public class Main {

    public static UserService userService;
    public static PostService postService;

    public static void main(String args[]){

        // Create instances of both the User and Post service
        userService = new UserServiceImpl();
        postService = new PostServiceImpl();

    }
}
