import java.util.Scanner;

public class DNI {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        char[] LETTERS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        System.out.println("Enter your DNI number");
        number = input.nextInt();
        System.out.println(LETTERS[number % 23]);
    }
}
