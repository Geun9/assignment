package assignment_0625_class.assignment1;

public class Move {
    String title;
    String genre;


    public void play() {
        System.out.printf("%s(%s) 상영중입니다.\n", this.title, this.genre);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
