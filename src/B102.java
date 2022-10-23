public class B102 {
    public void ConvertString(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        String string = new String(stringBuffer);

        if (!str.contains(".")) {
            if (Long.parseLong(string) > Integer.MAX_VALUE || Long.parseLong(string) < Integer.MIN_VALUE) {
                System.out.println("\"" + str + "\" as long is " + Long.parseLong(string) + " and as Long is " + Long.parseLong(string));
            } else {
                System.out.println("\"" + str + "\" as int is " + Integer.parseInt(string) + " and as Integer is " + Integer.parseInt(string));
            }
        } else {
            if (str.contains("D")) {
                System.out.println("\"" + str + "\" as double is " + Double.parseDouble(string) + " and as Double is " + Double.parseDouble(string));
            }

            if (str.contains("F")) {
                System.out.println("\"" + str + "\" as float is " + Float.parseFloat(string) + " and as Float is " + Float.parseFloat(string));
            }
        }
    }

//        if ((Integer.parseInt(string) < Integer.MAX_VALUE || Integer.parseInt(string) > Integer.MIN_VALUE) && !str.contains(".")){
//            System.out.println("\""+ str +"\" as int is " + Integer.parseInt(string) + " and as Integer is " + Integer.parseInt(string));
//        } else if (str.contains("D") && str.contains(".")){
//            System.out.println("\""+ str +"\" as double is " + Double.parseDouble(string) + " and as Double is " + Double.parseDouble(string));
//        } else if (str.contains("F") && str.contains(".")) {
//            System.out.println("\""+ str +"\" as float is " + Float.parseFloat(string) + " and as Float is " + Float.parseFloat(string));
//        } else {
//            System.out.println("\""+ str +"\" as long is " + Integer.parseInt(string) + " and as Long is " + Integer.parseInt(string));
//        }
//    }

        public static void main (String[]args){
            B102 b102 = new B102();
            b102.ConvertString("136254781");
        }
    }
