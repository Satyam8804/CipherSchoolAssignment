
class Point{
    private int x,y;
    Point(){

    }
     Point(int x , int y){

     }

     public void setX(int x){
        this.x=x;
     }
     public void setY(int y){
        this.y=y;
     }
     public void serXY(int x , int y){
        this.x=x;
        this.y=y;
     }

}

public class D9p4 extends Point{
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(5);
    }
}
