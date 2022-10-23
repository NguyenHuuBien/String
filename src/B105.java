
public class B105 {
    public int searchEquals(String str, String strNeedEquals) {
        int count = 0;
        for (int i = 0; i < str.length() - strNeedEquals.length() + 1; i++) {
            String strNull = str.substring(i, i + strNeedEquals.length());
            if (strNull.equals(strNeedEquals)) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        B105 b105 = new B105();
        System.out.println("aa' has occured 3 times in 'abcd abc aabc baa abcaa': " + b105.searchEquals("abcd abc aabc baa abcaa", "aa"));
    }
}