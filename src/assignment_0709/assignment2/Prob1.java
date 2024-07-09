package assignment_0709.assignment2;

public class Prob1 {

    public static void main(String args[]) {

        Prob1 prob1 = new Prob1();

        System.out.println(prob1.leftPad("SSG", 6, '#'));
        System.out.println(prob1.leftPad("SSG", 5, '$'));
        System.out.println(prob1.leftPad("SSG", 2, '&'));

    }

    public String leftPad(String str, int size, char padChar) {
        int remainingLength = size - str.length();
        if (remainingLength > 0) {
            String result = String.valueOf(padChar).repeat(remainingLength) + str;
            return result;

        } else {
            return str;
        }
    }

}