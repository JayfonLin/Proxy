package proxy;

public class UserManagerImpl implements UserManager{

    @Override
    public void addUser(String userId, String userName) {
        System.out.println("AddUser");
    }
    
}
