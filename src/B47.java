import java.util.ArrayList;
import java.util.Arrays;

public class B47 {
    public ArrayList SplitString(String str){
        String[] arr = str.split(" ");
        ArrayList arrayList = new ArrayList<>();
        for (String string: arr) {
            arrayList.add(string);
        }
        return arrayList;
    }
    public static void main(String[] args) {
        B47 b47 = new B47();
        System.out.println(b47.SplitString("Nguyen Huu Bien"));
    }
}
