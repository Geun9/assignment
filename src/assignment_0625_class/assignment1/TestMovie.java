package assignment_0625_class.assignment1;

public class TestMovie {
    public static void main(String[] args) {
        Move myMovie = new Move();
        myMovie.setTitle("어거스트 러쉬");
        myMovie.setGenre("Drama");
        myMovie.play();

        System.out.println("--------------------");

        Move yourMovie = new Move();
        yourMovie.setTitle("나는 전설이다");
        yourMovie.setGenre("SF");
        yourMovie.play();
    }
}
