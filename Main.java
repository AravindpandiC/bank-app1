package bankapp1;


import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception{

        List<User> userList = new ArrayList<>();
        Map<Integer,User> userMap = new HashMap<>();
        UserLogin login = new UserLogin();
        CreateUser newUser = new CreateUser();
        LoginDashBoard dashBoard = new LoginDashBoard();
        Scanner sc = new Scanner(System.in);


        while(true) {
            User currentUser = welcome(login, newUser, userMap, userList);

            if (currentUser == null) throw new Exception("Invalid user");

            dashBoard.welcomePage(currentUser);

            System.out.println("1.Go to main page");
            System.out.println("2.Logout");
            int input = sc.nextInt();
            if (input == 2) {
                System.out.println("Good bye");
                return;
            }
        }

    }


    private static User welcome(UserLogin login,CreateUser user, Map<Integer,User> userMap, List<User> userList) {
        User currentUser ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ABC bank");
        System.out.println("1.Login");
        System.out.println("2.Create account");
        int input = sc.nextInt();
        if(input==1) {
              currentUser = login.loginPage(userMap);
            return currentUser;
        }
        else {
            User user1 = user.createUser();
            userMap.put(user1.getId(),user1);
            userList.add(user1);
            System.out.println("Logging you in");
            return user1;

        }
    }
}
