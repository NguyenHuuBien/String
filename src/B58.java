public class B58 {
    public StringBuffer MoveSpacesTheFront(String str){
        StringBuffer stringBuffer = new StringBuffer(str);
        for (int i = 0; i < stringBuffer.length(); i++) {
            if (str.charAt(i) == ' '){
                stringBuffer.deleteCharAt(i);
                stringBuffer.insert(0, " ");
            }
        }
        return stringBuffer;
    }

    public static void main(String[] args) {
        B58 b58 = new B58();
        System.out.println(b58.MoveSpacesTheFront("Nguyen Huu Bien"));
    }
}
