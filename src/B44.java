public class B44 {
    public void PrintIndex(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(String.format("Current character %c position at %d", str.charAt(i), i));
        }
    }
    public static void main(String[] args) {
        B44 b44 = new B44();
        b44.PrintIndex("012345");
    }
}
