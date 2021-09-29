package basic;

public class FloatDouble {
    public static void main(String[] args) {
        float floatSum = 0.001f + 0.001f + 0.0001f;
        double doubleSum = 0.001 + 0.001 + 0.0001;
        String name = "이상흔";
        String name1 = "이상흔 허지훈";
        String birthday =  "1970/11/12";
        String year = birthday.substring(0, 4);
        String month = birthday.substring(5,7);
        String day = birthday.substring(8,10);


        Integer integerNumber = 3;
        String stringNumber = integerNumber.toString();

        System.out.println(stringNumber);
        System.out.println(year + "\n" + month + "\n" + day);
        System.out.println(name1.replaceAll("허지훈", "아토피"));
        System.out.println(name.length());
        System.out.println(floatSum + "," + doubleSum);
    }
}
