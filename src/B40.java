public class B40 {
    public StringBuffer StringReverse(String str){
        StringBuffer stringBuffer = new StringBuffer(str);
        return stringBuffer.reverse();
    }
    public static void main(String[] args) {
        B40 b40 = new B40();
        System.out.println(b40.StringReverse("123456789"));
    }
}
