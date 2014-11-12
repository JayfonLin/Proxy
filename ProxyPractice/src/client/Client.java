package client;

import proxy.LogHandler;
import proxy.UserManager;
import proxy.UserManagerImpl;

public class Client {
    public static void main(String args[]){
        LogHandler logHandler = new LogHandler();
        UserManager userManager = (UserManager) logHandler.newProxyInstance(new UserManagerImpl());
        userManager.addUser("0001", "张三");
    }
}
