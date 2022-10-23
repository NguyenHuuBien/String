public class B20 {

    public StringBuffer Reverses(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        if (stringBuffer.length() % 4 == 0){
            stringBuffer.reverse();
        }
        return stringBuffer;
    }

    public static void main(String[] args) {
        B20 b20 = new B20();
        System.out.println(b20.Reverses("bienc"));
    }
}
