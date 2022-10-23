public class B11 {

    public String RemoveOddIndex(String str){
        String string = "";
        for (int i = 0; i < str.length(); i+=2) {
            string += str.charAt(i);
        }
        return string;
    }

    public static void main(String[] args) {
        B11 b11 = new B11();
        System.out.println(b11.RemoveOddIndex("0123456"));
    }
}
