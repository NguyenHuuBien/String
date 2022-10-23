public class B6 {

    public String IngAndLy(String str){
        if (str.length() >= 3){
            if (str.substring(str.length() - 3).equals("ing")){
                str += "ly";
            } else {
                str += "ing";
            }
        }
        return str;
    }

    public static void main(String[] args) {
        B6 b6 = new B6();
        System.out.println(b6.IngAndLy("Biennn"));
        System.out.println(b6.IngAndLy("Biennning"));
        System.out.println(b6.IngAndLy("Bi"));
    }
}
