package Design_Principles_Patterns.SingletonPatternExample;

public class SingletonTest {
    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        l1.log("Applicated Started");
        l2.log("User Logged in");
        System.out.println(l1 == l2);
    }
}
