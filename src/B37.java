public class B37 {

    public String LeftRightCenter(int num){
        return String.format("Left  :|%1$-10d|\nRight :|%1$10d|\nCenter:|%^10d|", num);
    }

    public static void main(String[] args) {
        B37 b37 = new B37();
        System.out.println(b37.LeftRightCenter(5));
    }
}
