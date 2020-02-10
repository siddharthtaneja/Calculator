package Cal;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void TheIntro(){
        System.out.println("Enter 1 for Addition" + "\n" + "Enter 2 for Substraction" + "\n" + "Enter 3 for Multiplication" + "\n" + "Enter 4 for Division" + "\n" + "Enter 0 to exit the application");
    }
    public static void First(){
        System.out.println("Enter First Number");
    }
    public static void Second(){
        System.out.println("Enter Second Number");
    }

    public static void main(String[] args ) {
        Scanner s = new Scanner(System.in);
        TheIntro();
        int choice = s.nextInt();
        while(choice != 0){
            if(choice == 1){
                First();
                int a = s.nextInt();
                Second();
                int b = s.nextInt();
                System.out.println(a+b);
                TheIntro();
            }
            else if(choice == 2){
                First();
                int a =s.nextInt();
                Second();
                int b = s.nextInt();
                System.out.println(a-b);
                TheIntro();
            }
            else if(choice == 3){
                First();
                int a = s.nextInt();
                Second();
                int b = s.nextInt();
                System.out.println(a*b);
                TheIntro();
            }
            else if(choice == 4){
                First();
                double a = s.nextDouble();
                Second();
                double b = s.nextDouble();
                if(b == 0){
                    System.out.println("InAppropiate");
                    TheIntro();
                }
                else
                    System.out.println(a/b);
                TheIntro();
            }
            else {
                System.out.println("Plz enter a valid choice");
                TheIntro();
            }
            choice = s.nextInt();
        }
    }
}
