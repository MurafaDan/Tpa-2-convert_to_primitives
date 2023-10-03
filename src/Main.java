public class Main {
    public static void main(String[] args) {
        System.out.println("The changed from String variables are:");

        System.out.println("Valoarea booleana transforamta este:");
        String varBool1 = "tRue";
        Boolean varBool = new Boolean(varBool1);
        System.out.println(varBool);

        System.out.println("Valoarea Byte transforamta este:");
        String varByte2 = "120";
        Byte  varByte = new Byte(varByte2);
        System.out.println(varByte);

        System.out.println("Valoarea Short transforamta este:");
        String varShort3 = "32000";
        Short varShort = new Short(varShort3);
        System.out.println(varShort);

        System.out.println("Valoarea Integer transforamta este:");
        String varInt4 = "147895632";
        Integer varInt = new Integer(varInt4);
        System.out.println(varInt);

        System.out.println("Valoarea Long transforamta este:");
        String varlong5 = "987654321987654321";
        Long  varlong = new Long(varlong5);
        System.out.println(varlong);

        System.out.println("Valoarea double transforamta este:");
        String vardouble6 = "4444.5d";
        Double vardouble = new Double(vardouble6);
        System.out.println(vardouble);

        System.out.println("Valoarea float transforamta este:");
        String varfloat7 = "2354.56f";
        Float varfloat = new Float(varfloat7);
        System.out.println(varfloat);


    }
}