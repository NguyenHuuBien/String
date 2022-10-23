public class B4 {

    public StringBuffer ReplaceFirst(String str, String stringNeedRp ,String replacement){
        StringBuffer string = new StringBuffer(str);
        if (string.indexOf(stringNeedRp) == 0) {
            int index = string.indexOf(stringNeedRp, replacement.length());
            string.replace(index, index + stringNeedRp.length(), replacement);
        } else {
            int index = string.indexOf(stringNeedRp);
            string.replace(index, index + stringNeedRp.length(), replacement);
        }
        return string;
    }

    public static void main(String[] args) {
        B4 b4 = new B4();
        System.out.println(b4.ReplaceFirst("abcbienbien", "bien", "**"));
    }
}
