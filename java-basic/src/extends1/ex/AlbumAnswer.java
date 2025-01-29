package extends1.ex;

public class AlbumAnswer extends ItemAnswer{
    public String artist;

    public AlbumAnswer(String name, int price, String artist){
        super(name, price);
        this.artist = artist;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("- 아티스트: "+artist);
    };

}
