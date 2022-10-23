public class B21 {

    public String Upper2In4(String str){
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (Character.isUpperCase(str.charAt(i))){
                count += 1;
            }
        }
        if (count >= 2){
            str.toUpperCase();
        }
        return str + count;
    }

    public static void main(String[] args) {
        B21 b21 = new B21();
        System.out.println(b21.Upper2In4("NGUyenhuubien"));
    }
}
