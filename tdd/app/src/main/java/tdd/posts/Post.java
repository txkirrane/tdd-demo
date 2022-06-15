package tdd.posts;

import lombok.Getter;
import lombok.Setter;
import tdd.Model;
import tdd.users.User;

@Getter
@Setter
public class Post extends Model {
    
    private User owner;
    private String content;
    
}
