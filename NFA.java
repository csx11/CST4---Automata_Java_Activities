import java.util.Scanner;

public class NFA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String input = sc.nextLine();
        sc.close();

        boolean hasA = false;
        boolean accepted = false;

        for (char ch : input.toCharArray()) {
            if (ch == 'a') {
                hasA = true;
            } else if (ch == 'b' && hasA) {
                accepted = true;
                break;
            } else {
                hasA = false;
            }
        }
        if (accepted) {
            System.out.println("Accepted");
        } else {
            System.out.println("Rejected");
        }
    }
}