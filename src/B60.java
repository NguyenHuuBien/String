public class B60 {
    public static void main(String[] args) {
        System.out.println(String.format("%10c', '%c'%10c', '%c'%10c', '%c'%10c', '%c'\n" +
                "%10c', '%c'%10c', '%c'%10c', '%c'%11s\n" +
                "%10c', '%c'%10c', '%c'%10s%16c'", 'b', 'B', 'h', 'H', 's', 'S', 'c', 'C', 'e', 'E', 'x', 'X',
                'g', 'G', "%h", 'a', 'A', 't', 'T', "%", 'n'));
        System.out.println(String.format("%b", 1));
        System.out.println(String.format("%c", 'c'));
        System.out.println(String.format("%a", 1.2));
        System.out.println(String.format("%e", 12.3));
        System.out.println(String.format("%h", 'a'));
        System.out.println(String.format("%g", 1.234));
        System.out.println(String.format("%f", 1234.5));
        System.out.println(String.format("%x", 10));

    }
}
