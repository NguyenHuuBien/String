import java.lang.reflect.Array;

public class B5 {

    public String SwapTwoCharacter(String str1, String str2){
        StringBuffer string1 = new StringBuffer(str1);
        StringBuffer string2 = new StringBuffer(str2);

        String string = string1.substring(0, 2);

        string1.replace(0, 2, string2.substring(0, 2));
        string2.replace(0, 2, string);

        return string1 + " " + string2;
    }


    public static void main(String[] args) {
        B5 b5 = new B5();
        System.out.println(b5.SwapTwoCharacter("Nguyen", "Bien"));
    }
}
