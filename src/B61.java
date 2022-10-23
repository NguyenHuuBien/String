public class B61 {
    public String DoubleQuote(String str){
        return "\"" + str;
    }

    public static void main(String[] args) {
        B61 b61 = new B61();
        System.out.println(b61.DoubleQuote("Bien"));
    }
}
