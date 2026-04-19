import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) {

        Handler guestHandler = new AccessHandlerGuest();
        Handler userHandler = new AccessHandlerUser();
        Handler adminHandler = new AccessHandlerAdministrator();

        guestHandler.setNext(userHandler);
        userHandler.setNext(adminHandler);


        // Login and passwords for administrators
        ((AccessHandlerAdministrator) adminHandler).addAdminAccount("admin", "123qweASD");
        ((AccessHandlerAdministrator) adminHandler).addAdminAccount("administrator", "1234");

        // Login and passwords for users
        ((AccessHandlerUser) userHandler).addUserAccount("andrii", "1234");
        ((AccessHandlerUser) userHandler).addUserAccount("black_knight", "S@ruman1");
        ((AccessHandlerUser) userHandler).addUserAccount("white_knight", "ruman1");


        Account[] users = {
                Account.createAdmin("admin", "123qweASD"),
                Account.createAdmin("administrator", "1234"),
                Account.createUser("andrii", "1234"),
                Account.createGuest(),
                Account.createUser("black_knight", "S@ruman1"),
                Account.createUser("white_knight", "S111"),
                Account.createGuest(),
        };

        for (Account user : users) {

            guestHandler.handle(user);
        }
    }
}