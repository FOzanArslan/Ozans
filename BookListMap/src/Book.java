public class Book {
    private String name;
    private String authorName;
    private int releaseYear;
    private int pageNumber;

    public Book(String name, String authorName, int releaseYear, int pageNumber) {
        this.name = name;
        this.authorName = authorName;
        this.releaseYear = releaseYear;
        this.pageNumber = pageNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
