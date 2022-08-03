package exercise.B2;

public class Book extends Document {
    String author;
    int totalPage;

    public Book(String author, int totalPage) {
        this.author = author;
        this.totalPage = totalPage;
    }

    public Book(String id, String nxb, int number, String author, int totalPage) {
        super(id, nxb, number);
        this.author = author;
        this.totalPage = totalPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", totalPage=" + totalPage +
                ", id='" + id + '\'' +
                ", nxb='" + nxb + '\'' +
                ", number=" + number +
                '}';
    }
}
