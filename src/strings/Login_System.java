package strings;
import java.util.Scanner;

public class Login_System {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Username: ");
        String username = sc.nextLine().trim();

        System.out.print("Enter Email: ");
        String email = sc.nextLine().trim();

        System.out.print("Enter Password: ");
        String password = sc.nextLine().trim();

        // Username check
        if(username.isEmpty()){
            System.out.println("Username cannot be empty");
            return;
        }

        // Email validation
        if(email.contains("@") && email.endsWith(".com")){
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }

        // Password validation
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for(int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);

            if(Character.isDigit(ch)){
                hasNumber = true;
            }
            if(!Character.isLetterOrDigit(ch)){
                hasSpecial = true;
            }
        }

        if(password.length() >= 8 && hasNumber && hasSpecial){
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }

        sc.close();
    }
}