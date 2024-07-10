package assignment_0709.assignment4;

public class FindCharacters {

    public static void main(String[] args) {
        FindCharacters fc=new FindCharacters();
        int count=fc.countChar("Boys, be ambitious", 'b');
        System.out.println(count);

    }
    public int countChar(String str, char c) {
        int cnt = 0;

        char[] list = str.toCharArray();

        for (char ch : list) {
            if (ch == c) {
                cnt++;
            }
        }

        return cnt;
    }
}