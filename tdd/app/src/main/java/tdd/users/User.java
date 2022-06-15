package tdd.users;

import lombok.Getter;
import lombok.Setter;
import tdd.Model;

@Getter
@Setter
public class User extends Model {

    private String username;
    private String hashedPassword;

}
