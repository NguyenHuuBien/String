
public class B8 {

    public String LongestWord(String str){
        String[] arr = str.split(" ");
        int max = arr[0].length();
        String word = "";
        for (String string: arr) {
            if(string.length() >= max){
                max = string.length();
                word = string;
            }
        }
        return String.format("Word Longest: %s\nLength: %d", word, max);
    }

    public static void main(String[] args) {
        B8 b8 = new B8();
        System.out.println(b8.LongestWord("Nguyen Huu Bien"));
    }
}
