package assignment_0701.assignment3_2;

import static assignment_0701.assignment3_2.VideoPrice.*;

public class Video extends Content{
    private String genre;

    public Video() {

    }

    public Video(String title, String genre) {
        super(title);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    void totalPrice() {
        if (this.genre.toLowerCase().equals(NEW.getGenreType())) {
            this.setPrice(NEW.getPrice());
        } else if (this.genre.toLowerCase().equals(COMIC.getGenreType())) {
            this.setPrice(COMIC.getPrice());
        } else if (this.genre.toLowerCase().equals(CHILD.getGenreType())) {
            this.setPrice(CHILD.getPrice());
        } else {
            this.setPrice(OTHER.getPrice());
        }
    }
}
