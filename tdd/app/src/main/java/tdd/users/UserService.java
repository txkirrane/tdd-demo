package tdd.users;

import java.util.ArrayList;

import tdd.Service;
import tdd.posts.Post;

public interface UserService extends Service<User> {
    ArrayList<Post> getPostsForUser(User user);
}
