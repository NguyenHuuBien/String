import java.util.Scanner;

public class B13 {

    public String UpperAndLower(String str){
        return String.format("Upper: %s\nLower: %s", str.toUpperCase(), str.toLowerCase());
    }

    public static void main(String[] args) {
        B13 b13 = new B13();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String str = scanner.nextLine();
        System.out.println(b13.UpperAndLower(str));

    }
}
