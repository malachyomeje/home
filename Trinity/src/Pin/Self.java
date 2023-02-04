package Pin;

import java.util.Scanner;

public class Self {
    public static void main(String[] args) {
        String name;
        String email;
        String password;
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.println(" \n...ENTER YOUR DETAILS TO REGISTER...");

        while (true) {
            System.out.print(" Enter your name  ");
            name = scan.nextLine();
            if (!name.isEmpty()) {
                break;
            }
            System.out.println(" name can not be empty ..try again ");
        }
        while (true) {

            System.out.print(" Enter your Email ");
            email = scan.nextLine();
            if (!email.isEmpty() && email.contains("@")) {
                break;
            }
            System.out.println(" Email must  not be empty and contain @");
        }


        while (true){

            System.out.print(" Enter your password");
            password = scan.nextLine();
         if (! password.isEmpty() && password.length() >=8) {
             break;
         }
            System.out.println( "password must not be empty contain 8 charater ");
        }

        while (true) {

            System.out.println( " Enter your age ");
            try {
                age =scan.nextInt();
                if ( age > 0){
                   break;
                }
                System.out.println( " age must be positve number ");

            }
            catch ( Exception e){
                System.out.println( " invalid input try again");
            }

        }
scan.nextLine();
        System.out.println(" regestration complte");
        System.out.println("name " + name);
        System.out.println("email " + email);
        System.out.println("password " + password);
        System.out.println("age "+ age);

        scan.close();
    }


}
