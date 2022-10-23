public class B24 {

    public boolean StartWithSpecified(String str, String startwithsprecified){
        return str.substring(0, startwithsprecified.length()).equalsIgnoreCase(startwithsprecified);
    }

    public static void main(String[] args) {
        B24 b24 = new B24();
        System.out.println("Nguyen Huu Bien start nguyen : " + b24.StartWithSpecified("Nguyen Huu Bien", "nguyen"));
    }
}
