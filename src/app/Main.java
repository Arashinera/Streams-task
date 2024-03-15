package app;

public class Main {

    public static void main(String[] args) {
        UserDataHandler handler = new UserDataHandler();
        Outputer outputer = new Outputer();
        outputer.getOutput(handler.handleUserData(UserDataProvider.newUserList()));
    }
}
