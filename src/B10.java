public class B10 {

    public String FirstAndLastChar(String str){
        char ch = str.charAt(0);
        char ch1 = str.charAt(str.length() - 1);
        String stringMid = str.substring(1, str.length() - 1);
        return ch1 + stringMid + ch;

    }

    public static void main(String[] args) {
        B10 b10 = new B10();
        System.out.println(b10.FirstAndLastChar("ohooooooa"));
    }
}
