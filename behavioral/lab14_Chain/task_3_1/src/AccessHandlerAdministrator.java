import java.util.HashMap;
import java.util.Map;

public class AccessHandlerAdministrator extends AccessHandler {

    private Map<String, String> adminsAccounts = new HashMap<>();

    public void addAdminAccount(String login, String password){
        adminsAccounts.put(login, password);
    }

    public void handle(Account account){
        if (account.getAccessType() == Account.AccessType.Administrator) {
            String adminLogin = account.getLogin();
            String adminPassword = account.getPassword();

            String passwordFromAdminsStorage = adminsAccounts.get(adminLogin);
            if (adminPassword.equals(passwordFromAdminsStorage) && adminPassword.length() >= 8) {
                System.out.println("Administrator access provided: " + adminLogin);
            } else {
                System.out.println("Access denied: " + adminLogin);
            }

        } else super.handle(account);
    }
}
