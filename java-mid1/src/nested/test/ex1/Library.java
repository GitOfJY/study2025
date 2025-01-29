package nested.test.ex1;

public class Library {

    private Book[] books;
    private int bookCnt;

    public Library(int size) {

        books = new Book[size];
        bookCnt = 0;

    }

    public void addBook(String title, String author){

        /*
        정상로직 + 예외로직이 섞여 있는 경우
        if (bookCnt < books.length){
            books[bookCnt++] = new Book(title, author);
        } else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
        */
        
        // 검증 로직을 먼저 처리
        if (bookCnt >= books.length){
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        
        // 정상 로직 처리
        books[bookCnt++] = new Book(title, author);

    }

    public void showBooks() {
        System.out.println("=== 책 목록 출력 ===");
        for (int i=0; i<bookCnt; i++){
            System.out.println("도서 제목 : " + books[i].title + ", 저자 : " + books[i].author);
        }
    }

    private static class Book{
        private String title;
        private String author;

        public Book(String title, String author){
            this.title = title;
            this.author = author;
        }

    }

}
