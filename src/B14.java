import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class B14 {

    public ArrayList<String> UniqueAndSort(String str){
        String[] arr = str.split(",");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));
        ArrayList<String> arrayList1 = new ArrayList<>();
        for (String string : arrayList) {
            if(!arrayList1.contains(string)){
                arrayList1.add(string);
            }
        }
        arrayList1.sort(Comparator.naturalOrder());
        return arrayList1;
    }

    public static void main(String[] args) {
        B14 b14 = new B14();
        System.out.println(b14.UniqueAndSort(" red, white, black, red, green, black, blue"));
    }
}
