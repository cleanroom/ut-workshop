package ares;

public class FizzBuzz {
    public static String sayFizzBuzz(int num) {
        String str = "";
        if (num % 3 == 0) {
            str += "Fizz";
        }
        if (num % 5 == 0) {
            str += "Buzz";
        }
        if (str.equals("")) {
            str = "" + num;
        }
        return str;
    }
}
