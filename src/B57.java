public class B57 {
    public String RemoveSpaces(String str){
        str.trim();
        return str.replaceAll("\\s+", "");
    }
    public static void main(String[] args) {
        B57 b57 = new B57();
        System.out.println(b57.RemoveSpaces("      Nguyen    Huu     Bien"));
    }
}
