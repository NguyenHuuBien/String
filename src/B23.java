public class B23 {

    public String RemoveNewLine(String str){
        return str.replace("\n", " ");
    }

    public static void main(String[] args) {
        B23 b23 = new B23();
        System.out.println("Before:\nNguyen\nHuu\nBien");
        System.out.println("After: " + b23.RemoveNewLine("Nguyen\nHuu\nBien"));
    }
}
