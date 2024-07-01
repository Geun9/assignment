package assignment_0701.assignment3_2;

public enum VideoPrice {
    NEW("new", 2000),
    COMIC("comic", 1500),
    CHILD("child", 1000),
    OTHER("other", 500);

    private final String genreType;
    private final int price;

    VideoPrice(String genreType, int price) {
        this.genreType = genreType;
        this.price = price;
    }

    public String getGenreType() {
        return genreType;
    }

    public int getPrice() {
        return price;
    }
}
