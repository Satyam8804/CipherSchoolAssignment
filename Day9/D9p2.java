interface Test{
    void square();
}
class Arithmetic implements Test{
   
    @Override
    public void square() {
       System.out.println("Test");        
    }

}
class ToTestIn extends Arithmetic{
    Arithmetic a1 = new ToTestIn();
}
public class D9p2 extends ToTestIn {
    public static void main(String[] args) {
        ToTestIn t1 = new ToTestIn();
        
    }
}
