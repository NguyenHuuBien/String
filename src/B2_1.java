public class B2_1 {

    public void countNumberAndCountCharacter(String str){
        int countNumber = 0;
        int countCharacter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                countNumber++;
            }
            if (Character.isLetter(str.charAt(i))){
                countCharacter++;
            }
        }
        System.out.println(String.format("%s: %d number, %d Character", str, countNumber, countCharacter));
    }

    public static void main(String[] args) {
        B2_1 b2_1 = new B2_1();
        b2_1.countNumberAndCountCharacter("bienz123@#");
    }
}
