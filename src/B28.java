
public class B28 {

    public StringBuffer InsertTheLine(String str, String strInsert){
        StringBuffer stringBuffer = new StringBuffer(str);
        return stringBuffer.insert(0, strInsert);
    }

    public static void main(String[] args) {
        B28 b28 = new B28();
        System.out.println(b28.InsertTheLine("NguyenHuuBien", "abc"));
    }
}
