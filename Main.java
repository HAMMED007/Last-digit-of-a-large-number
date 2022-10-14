import java.math.BigInteger;

public class Main {


    public static void main(String[] args) {


        System.out.println(Kata.lastDigit(new BigInteger("647165"), new BigInteger("0")));


    }


    public class Kata {
        public static int lastDigit(BigInteger n1, BigInteger n2) {

            String original = n1.toString();

            int number = Integer.parseInt(original.substring(original.length() - 1));
            int reminder = 0;
            // System.out.println(number);


            int result = 0;


            BigInteger a
                    = new BigInteger("4");
            BigInteger b
                    = new BigInteger(n2.toString());


            reminder = Integer.parseInt(String.valueOf(b.remainder(a)));


            if (n2.toString() == "0")
                return 1;
            if (number == 5)
                return 5;
            if (number == 1)
                return 1;
            if (number == 0)
                return 0;
            if (number == 0 && Integer.parseInt(n2.toString()) > 0)
                return 1;


            if (reminder == 0 && (number == 2 || number == 4 || number == 6 || number == 8)) {
                result = 6;
                return result;
            }
            if (reminder == 0 && (number == 3 || number == 7 || number == 9)) {
                result = 1;
                return result;
            }
            if (reminder != 0) {

                result = (int) Math.pow(number, reminder);

                String val = String.valueOf(result);
                result = Integer.parseInt(val.substring(val.length() - 1));


                return result;
            }


            return 0;
        }
    }


}