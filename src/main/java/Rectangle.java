public class Rectangle {

    //PROPERTIES

    private int width;
    private int length;

    //CONSTRUCTOR

    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }

    //BEHAVIOURS

    public int calcArea(){
        return width*length;
    }

    public boolean checkSqr(){
        return width==length;
    }


}
