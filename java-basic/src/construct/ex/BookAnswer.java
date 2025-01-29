package construct.ex;

public class BookAnswer {
    String title;
    String author;
    int page;

    BookAnswer(){
        this("", "", 0);
        /*
        this.title = title;
        this.author = author;
        this.page = 0;
        */
    }

    BookAnswer(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    BookAnswer(String title, String author){
        this(title, author, 0);
        /*
        this.title = title;
        this.author = author;
        this.page = 0;
        */
    }

    void displayInfo() {
        System.out.println("제목 : "+title+" 저자 : "+author+" 페이지 : "+page);
    }

}
