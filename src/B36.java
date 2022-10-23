public class B36 {

    public String NumberWithPercentage(double number){
        return String.format("Number: %.2f", number);
    }
    public static void main(String[] args) {
        B36 b36 = new B36();
        System.out.println(b36.NumberWithPercentage(1.23456));
    }
}
