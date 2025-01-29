package extends1.ex;

public class Movie extends Item{

    public String director;
    public String actor;

    public Movie(String name, int price, String director, String actor){
        this.name = name;
        this.price = price;
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void print(){
        System.out.println("이름: " + name + ", 가격: " + price);
        System.out.println("- 감독: "+director+", 배우: " + actor);
    };

}
