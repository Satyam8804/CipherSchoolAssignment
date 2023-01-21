class ColorChecking{
    int red = 193;
    int green = 255;
    int blue = 183;

    float r1 = red/255.1f;
    float g1 = green/255.1f;
    float b1 = blue/255.1f;
    float cMax = g1; 
    float cMin = b1;
    
    float diff  = cMax-cMin;
    void hue(){
        System.out.println("HUE : "+60*((b1-r1)/diff +2));
    }
    void saturation(){
        System.out.println("Saturation : " + diff/(1-Math.abs(2*(cMax+cMin)/2 -1))*100);
    }
    void brightness(){
        System.out.println("Brightness : " + ((cMax+cMin)/2)*100);
    }
}

public class D9p3 extends ColorChecking{
    public static void main(String[] args) {
        ColorChecking check = new D9p3();
        check.brightness();
        check.hue();
        check.saturation();
    }
}
