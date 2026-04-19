import java.util.HashMap;
import java.util.Map;

public class AccessHandlerUser extends AccessHandler {

    private Map<String, String> usersAccounts = new HashMap<>();

    public void addUserAccount(String login, String password){
        usersAccounts.put(login, password);
    }

    public void handle(Account account){
        if (account.getAccessType() == Account.AccessType.User) {
            String userLogin = account.getLogin();
            String userPassword = account.getPassword();

            String passwordFromUserStorage = usersAccounts.get(userLogin);
            if (userPassword.equals(passwordFromUserStorage)) {
                System.out.println("User access provided: " + userLogin);
            } else {
                System.out.println("Access denied: " + userLogin);
            }

        } else super.handle(account);
    }
}
