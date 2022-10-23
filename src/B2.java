import java.util.ArrayList;

public class B2 {

    public ArrayList searchCharacter(String str){
        ArrayList charinStr = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if(!charinStr.contains(str.charAt(i))){
                charinStr.add(str.charAt(i));
            }
        }
        return charinStr;
    }

    public void CountCharacter(String str){
        ArrayList charinStr = searchCharacter(str);
        ArrayList countCharacter = new ArrayList();

        for (int i = 0; i < charinStr.size(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(charinStr.get(i).equals(str.charAt(j))){
                    count ++;
                }
            }
            countCharacter.add(count);
        }

        for (int i = 0; i < charinStr.size(); i++) {
//            System.out.println(charinStr.get(i) + ": " + countCharacter.get(i));
            System.out.print(String.format("{%s: %d}", charinStr.get(i), countCharacter.get(i)));
        }
    }

    public static void main(String[] args) {
        B2 b2 = new B2();
        b2.CountCharacter("asddsaasddsa");
    }
}
