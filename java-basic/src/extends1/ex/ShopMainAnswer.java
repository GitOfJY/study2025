package extends1.ex;

public class ShopMainAnswer {
    public static void main(String[] args) {
        BookAnswer book = new BookAnswer("Java", 10000, "han", "12345");
        AlbumAnswer album = new AlbumAnswer("앨범1", 15000, "seo");
        MovieAnswer movie = new MovieAnswer("영화1", 18000, "감독1", "배우1");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격 합 : "+sum);

    }
}
