package Choteproject;
import java.util.*;
public class smallproject {
    public static void main(String[] args) {
        //Bank management
        //jama //nikalna //balance check 
        System.out.println("<----WELCOME TO ATHARVA ❤  BANK---->");

        //int Dep = 0;
        int pin = 2216;

        double balance = 10000.00;

        System.out.println("Please enter your pin");

        Scanner sc = new Scanner(System.in);
        int pini = sc.nextInt();

//        int A = 1;
//        while(A<){
//            System.out.println("End of attempt");
//            A++;
        
        //      for (int i = 0; i <= 3; i++) 
//        {
//            System.out.println("Invalid attempt");
//        do{
//            System.out.println("End of attempt");
//            pini = pini++;
//        }while(pini>=3);
//        
            if (pini == 2216) {
                System.out.println("Your pin is correct");
            } else {
                System.out.println("Invalid pin, Try again");
                return;
                //sc.close();
            }
            
        int A = 0;
        while(A<=3){
            System.out.println("End of attempt");
            A++;
            return;
        }
           for(int i = 0; i<3; i++); 
            
            
            
            


            //choose one option
            System.out.println("Choose any one");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check balance");

            //Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();
            // String opti = sc.nextLine();

            switch (opt) {
                case 1: {
                    System.out.println("ENTER AMOUNT TO DEPOSIT");
                    double depo = sc.nextDouble();

                    // System.out.println("Your amount " + depo + " is added");
                    if (depo > 2000) {
                        System.out.println("Enter a valid amount");
                        return;
                    }

                    depo = balance += depo;
                    // balance+=depo;
                    System.out.println("Transaction successful");
                    System.out.println("Your total balance now = " + depo);

//               if(depo>500){
//                   System.out.println("Invalid amount");
//               }

                    break;
                }
                case 2: {
                    System.out.println("Enter AMOUNT TO WITHDRAW");
                    double with = sc.nextInt();
                    if (with > balance) {
                        System.out.println("Enter a valid amount");
                        return;
                    }

                    with = balance -= with;

                    System.out.println("Transaction successful");

                    System.out.println("Your total balance now = " + with);
                    break;
                }
                case 3: {
                    System.out.println("YOUR BALANCE IS = " + balance);
                }
            }


        }
    }
