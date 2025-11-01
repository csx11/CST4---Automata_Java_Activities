import java.util.Scanner;

public class DFA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String input = sc.nextLine();
        
        int state = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '0') {
                if (state == 0 || state == 2)
                    state = 1;
                else if (state == 1)
                    state = 1; 
            } 
            else if (ch == '1') {
                if (state == 0)
                    state = 0;
                else if (state == 1)
                    state = 2;
                else if (state == 2)
                    state = 0; 
            } 
            else {
                System.out.println("Invalid input");
                return;
            }
        }

        if (state == 2)
            System.out.println("Accepted");
        else
            System.out.println("Rejected");

        sc.close();
    }
}