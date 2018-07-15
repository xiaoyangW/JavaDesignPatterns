package proxy;

/**
 * @author WXY
 */
public class App {

    public static void main(String[] args) {
        IUserDao userDao = new UserDao();

        UserProxy userProxy = new UserProxy(userDao);

        userProxy.save();
    }

}
