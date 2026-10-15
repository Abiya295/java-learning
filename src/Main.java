//Adding more features
import java.util.Scanner;
        class Char
        {
            public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);
                //get a char from user
                System.out.println("Enter a character:");
                char ch = sc.nextLine().charAt(0);
                if((int)ch>=65 && (int)ch<=90){
                    System.out.print("Upper Case");
                }
                else if((int)ch>=97 && (int)ch<=122){
                    System.out.print("Lower Case");
                }
                else
                {
                    System.out.print("Invalid Letter");
                }

            }
        }

