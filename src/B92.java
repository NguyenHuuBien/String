public class B92 {
    public StringBuffer RemoveAllInstance(String string, String strNeedRemove){
        StringBuffer str = new StringBuffer(string);
        for (int i = 0; i < str.length() - strNeedRemove.length() + 1; i++) {
            String strNull = str.substring(i, i + strNeedRemove.length());
            if (strNull.equals(strNeedRemove)) {
                str.delete(i, i + strNeedRemove.length());
            }
        }
        return str;
    }

    public static void main(String[] args) {
        B92 b92 = new B92();
        System.out.println(b92.RemoveAllInstance("troi oi la troi", "oi"));
    }
}
