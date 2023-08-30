public class DataTypes {
    public static void main(String[] args) {
        byte byteValue = 23;
        short shortValues = 10000;
        int intValue = 455555;

        long longValue = 567L;
        float floatValue = 7.6f;
        char charValue = 'k';
        boolean booleanValue = false;
        System.out.println(byteValue);
        System.out.println(shortValues);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(charValue);
        System.out.println(booleanValue);



        //implicit casting
        int intValue1=100;
        float floatValue1=intValue1;
        System.out.println(floatValue1);





        //explicit conversion
        double doubleValue1=123.45;
        int intValue2=(int) doubleValue1;
        System.out.println(intValue2);







    }
}