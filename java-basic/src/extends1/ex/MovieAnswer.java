package extends1.ex;

public class MovieAnswer extends ItemAnswer{

    public String director;
    public String actor;

    public MovieAnswer(String name, int price, String director, String actor){
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("- 감독: "+director+", 배우: " + actor);
    };

}
