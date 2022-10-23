public class B27 {

    public String RemoveExiting(String str){
        return str.trim();
    }

    public static void main(String[] args) {
        B27 b27 = new B27();
        System.out.println(b27.RemoveExiting("  \tNguyen Bien"));
    }
}
