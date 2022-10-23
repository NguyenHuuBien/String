public class B15 {
    public String HTML(String... values){
        String string = "";
        String string1 = "";
        for (String str: values) {
            if ((str.equals("i") || str.equals("b") || str.equals("span"))){
                string += "<"+ str + ">";
                string1 += "</"+ str + ">";
            }
        }
        return String.format("%1$s%2$s%3$s", string, values[values.length - 1], string1);
    }

    public static void main(String[] args) {
        B15 b15_chualam = new B15();
        System.out.println(b15_chualam.HTML("i", "haha", "span", "Hello"));
    }
}
