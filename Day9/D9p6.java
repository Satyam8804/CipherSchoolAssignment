class Box{
    private int length;
private int breadth;
private int height;
Box(int l , int b,int h){
    this.length = l;
this.breadth = b;
this.height =h;
}
public void area(){
    int Area = length*breadth*height;
    System.out.println("Area : " +Area);
}

}
class Box3d extends Box{
    private int length;
    private int breadth;
    private int height;
  

    Box3d(int l1 , int b1,int h1){
    this.length = l1;
    this.breadth = b1;
    this.height =h1;
    }
    public void area(){
        int Area = length*breadth*height;
        System.out.println("Area : " +Area);
    }
}

public class D9p6 extends Box3d{
    public static void main(String[] args) {
        
    }
}
