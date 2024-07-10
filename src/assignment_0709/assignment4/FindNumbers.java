package assignment_0709.assignment4;

public class FindNumbers {

    public static void main(String[] args) {
        FindNumbers fn=new FindNumbers();

        long number = 228754462;
        System.out.println( "입력 숫자 = " + number );
        System.out.println("2 횟수 => " + fn.countNumber(number, 2));//3을 리턴
        System.out.println("4 횟수 => " + fn.countNumber(number, 4));//2를 리턴
    }

    /*  이곳에 countNumber 메소드를 작성하십시오. */
    public static int countNumber(long number, int i) {
        int cnt = 0;
        String[] list = String.valueOf(number).split("");
        for (String s : list) {
            if (Integer.parseInt(s) == i) {
                cnt++;
            }
        }
        return cnt;
    }
}