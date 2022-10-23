public class B3 {

    public String ReturnIndex2_4_3(String str){
        return String.format("%s:\nindex 2: %s\nindex 4: %s\nindex 3: %s", str, str.charAt(2), str.charAt(4), str.charAt(3));
    }
    public static void main(String[] args) {
        B3 b3 = new B3();
        System.out.println(b3.ReturnIndex2_4_3("NgaeynHuuBien"));
    }
}
