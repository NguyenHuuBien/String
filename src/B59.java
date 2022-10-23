public class B59 {
    public boolean IsEmptyOrNUll(String str){
        return str == null || str.isEmpty();
    }

    public static void main(String[] args) {
        B59 b59 = new B59();
        System.out.println(b59.IsEmptyOrNUll("a"));
        System.out.println(b59.IsEmptyOrNUll(""));
        System.out.println(b59.IsEmptyOrNUll(null));
    }
}
