
interface A{
    void meth1();

    void meth2();
}


public class d9p1 implements A{
    public static void main(String[] args) {
        A aObj = new d9p1();
        aObj.meth1();
        
    }

    @Override
    public void meth1() {
System.out.println("Meth1");        
    }

    @Override
    public void meth2() {
       System.out.println("Meth2");
        
    }
}
