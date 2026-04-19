public class AccessHandlerGuest extends AccessHandler {

    public void handle(Account account){
        if (account.getAccessType() == Account.AccessType.Guest) {

            System.out.println("Guest access provided!");

        } else super.handle(account);
    }
}
