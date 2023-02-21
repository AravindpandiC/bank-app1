package bankapp1;

import java.util.Scanner;

public class LoginDashBoard {
    public void welcomePage(User currentUser) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Check Balance");
        System.out.println("4.Edit account info");
        System.out.println("5.To see account details");

        int userInput = sc.nextInt();
        if(userInput==1) deposit(currentUser);
        else if(userInput==2) withdraw(currentUser);
        else if(userInput==3) checkBalance(currentUser);
        else if(userInput==4) editInfo(currentUser);
        else accountInfo(currentUser);
    }


    public void deposit(User user){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the deposit amount");
        int amount = sc.nextInt();
        user.deposit(amount * 1.0);
        message(user);
    }

    private void withdraw(User user) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please the enter the to withdraw");
        int amount = sc.nextInt();
        try{
            user.withdraw(amount*1.0);
        }
        catch (Exception ex){
            System.out.println("Insufficient funds");
        }
        message(user);
    }

    private void checkBalance(User user) {
        System.out.println("Your balance "+user.getBalance());
        message(user);
    }
    private void editInfo(User user) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Change the account name");
        System.out.println("2.Modify your age");
        System.out.println("3.Change phone number");
        int editAccount = sc.nextInt();
        if(editAccount==1){
            System.out.println("Enter the name: ");
            String name = sc.next();
            user.setName(name);
        }
        else if(editAccount==2){
            System.out.println("Enter the correct age: ");
            int age = sc.nextInt();
            user.setAge(age);
        }
        else{
            System.out.println("Enter the phone number");
            user.setMobileNo(sc.next());
        }
        message(user);
    }

    private void accountInfo(User currentUser) {
        System.out.println(currentUser);
    }



    public void message(User user){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Go to dashboard again");
        System.out.println("2.Exit");
        int depositInput = sc.nextInt();
        if(depositInput==1) welcomePage(user);
        else {
            System.out.println("Thank you banking  with us!!");
        }
    }
}
