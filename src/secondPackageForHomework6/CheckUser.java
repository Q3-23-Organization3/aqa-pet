package secondPackageForHomework6;

import homework6.User;

public class CheckUser {
    public static void main(String[] args) {
        User user1 = new User("Rachel");
        User user2 = new User("Monica");
        User user3 = new User("Phoebe");

        user1.setAge(16);
        user2.setAge(27);
        user3.setAge(32);

        user1.email("r.green@gmail.com");
        user2.email("m.geller@gmail.com");
        user2.email("regina.philange@gmail.com");

        user1.setPassword("qazwsxed");
        user2.setPassword("qwe");
        user3.setPassword("qazwsxed123");

        user1.makePurchase(44.0);
        user2.makePurchase(5.58);
        user3.makePurchase(121.11);

        getUser(user1);
        getUser(user2);
        getUser(user3);

    }
    public static void getUser(User anyUser) {
        System.out.println();
        System.out.println("Name: " + anyUser.userName);
        System.out.println("Age: " + anyUser.getAge());
        System.out.println("Email: " + anyUser.email);
        System.out.println("Password: " + anyUser.getPassword());
        System.out.println("Active: " + anyUser.isActive());
        anyUser.printTotalAmountOfSpentMoney();
    }
}
