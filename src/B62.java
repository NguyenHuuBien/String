public class B62 {
    public static String GlueString()
    {
        String tech = "tech";
        String dot = ".";
        String io = "io";
        return String.format("%s%s%s", tech, dot, io); // fix this to include the glued string
    }

    public static void main(String[] args) {
        System.out.println(GlueString());
    }
}
