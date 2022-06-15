package tdd;

import java.util.HashMap;
import java.util.Random;
import java.util.UUID;

import tdd.users.User;

public class MockUtils {

    private static String[] names = new String[]{
        "Joe",
        "Smith",
        "Fran",
        "Greg",
        "Thomas",
        "Nick",
        "Bob",
        "Richard",
        "Phil"
    };

    private static String getRandomName(){
        return names[new Random().nextInt(names.length)];
    }

    public static HashMap<UUID, User> generateUserTable(){
        return generateUserTable(10);
    }

    public static HashMap<UUID, User> generateUserTable(int quantity){

        // Create a HashMap to store the mocked users
        HashMap<UUID, User> users = new HashMap<>();

        // Create n number of users to add
        for (int i = 0; i < quantity; i++) {

            // Create a new User object
            User u = new User();

            // Generate a long random name
            u.setUsername(getRandomName() + getRandomName() + getRandomName());

            // Add created user to the table
            users.put(u.getId(), u);
        }

        // Return the created table for mock
        return users;
    }
}
