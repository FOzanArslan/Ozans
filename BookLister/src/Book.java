class Book implements Comparable<Book>{
    private String bookName;
    private int pageNumber;
    private String authorName;
    private int relDate;

    public String toString() { return (" " + this.bookName + " "+ this.getPageNumber()); }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getRelDate() {
        return relDate;
    }

    public void setRelDate(int relDate) {
        this.relDate = relDate;
    }

    public Book(String bookName, int pageNumber, String authorName, int relDate) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.relDate = relDate;
    }

    @Override
    public int compareTo(Book bk) {
        if(bookName.compareTo(bk.bookName) == 0) return 0;
        else if (bookName.compareTo(bk.bookName)>0 )return 1;
        else return -1;
    }
}
