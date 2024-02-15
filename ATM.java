import java.util.*;
public class ATM{


public static void main (String[]args){
    int pin=1234;
    int balance=10000;

    int Addamount=0;
    int Takeamount=0;

    String name;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter your Pin number");

    int Password= scanner.nextInt();
    if(Password==pin){
        System.out.println("Enter your Name");
        name=scanner.next();
        System.out.println("Welcome to the all in one mini ATM "+name);

        while(true){
              System.out.println("Press 1 to Check your Balance");
              System.out.println("Press 2 to Add amount to your Account");
              System.out.println("Press 3 to Take amount from your Account");
              System.out.println("Press 4 to Take your Resipt");
              System.out.println("Press 5 to Exit");

              int Opt=scanner.nextInt();
        
              switch(Opt){
                    case 1:
                        System.out.println("Your current balance is "+ balance);
                        break;

                    case 2:
                        System.out.println("How much amount did you want to ADD your Bank account");
                        int  Addamount1=scanner.nextInt();
                        System.out.println("Successfully creditied");
                        float Totalbalance =  Addamount1 + balance;
                        System.out.println("Your Total balance is "+ Totalbalance);
                        break;

                    case 3:
                        System.out.println("How much amount did you want to take");
                        float Takeamount1 = scanner.nextInt();

                        if(Takeamount1>balance){
                               System.out.println("Your balance is Insufficient");
                               System.out.println("Your current balance is " + balance  +"Soo please check it. "+"Try less than your Available balnce. ");

                        }
                        else{
                               System.out.println("Successfully taken");
                               float Takebalance= balance - Takeamount1;
                               System.out.println("Your current balance is "+ Takebalance);
                        }
                        break;

                    case 4:
                        System.out.println("Welcome to all in one Mini ATM");
                        System.out.println("Available balance is "+balance);
                        System.out.println("Amount deposited "+ Addamount);
                        System.out.println("Amount taken "+ Takeamount);
                        System.out.println("Thankyou!");
                        break; 
              }
                    if(Opt==5){
                        System.out.println("Thankyou !"+ name+"Please visit again");
                    }
                    else{
                        System.out.println("Invalid pin number please check that.");
                    }
                    break;
              }
        }

    }


}
