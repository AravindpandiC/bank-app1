package bankapp1;

import java.util.Set;
import java.util.Map;
import java.util.Scanner;

public class UserLogin {

    User user;
    public User loginPage(Map<Integer,User> userMap){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user id");
        int inputId = sc.nextInt();

        Set<Integer> userIds= userMap.keySet();
        if(!userIds.contains(inputId)) {
            System.out.println("Your account number doesn't exist or wrong. Provide valid id");
            loginPage(userMap);
        }
        user = userMap.get(inputId);
        System.out.println("Welcome back "+user.getName());
        return user;
    }
}
