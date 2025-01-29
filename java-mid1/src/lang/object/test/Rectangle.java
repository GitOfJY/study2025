package lang.object.test;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString(){
        return "Rectangle(width="+width+", height="+height+")";
    }

    @Override
    public boolean equals(Object obj){
        Rectangle rec = (Rectangle) obj;
        boolean result = false;
        if ((this.width == rec.width) && (this.height == rec.height)){
            result = true;
        }
        return result;
    }

}
