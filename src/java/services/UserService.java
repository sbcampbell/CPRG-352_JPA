package services;

import database.UserDB;
import models.Users;
import java.util.List;

public class UserService {

    public Users get(String username) throws Exception {
        UserDB userDB = new UserDB();
        return userDB.getUser(username);
    }

    public List<Users> getAll() throws Exception {
        UserDB userDB = new UserDB();
        return userDB.getAll();
    }

    public void update(String username, String password, String firstname, String lastname, String email) throws Exception {
        UserDB userDB = new UserDB();
        Users user = userDB.getUser(username);
        user.setPassword(password);
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setEmail(email);
        userDB.update(user);
    }

    public void delete(String username) throws Exception {
        UserDB userDB = new UserDB();
        Users deletedUser = userDB.getUser(username);

        if (!deletedUser.getUsername().equals("admin")) {
            userDB.delete(deletedUser);
        }
    }

    public void insert(String username, String password, String firstname, String lastname, String email) throws Exception {
        UserDB userDB = new UserDB();
        Users user = new Users(username, password);
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setEmail(email);
        userDB.insert(user);
    }
}
