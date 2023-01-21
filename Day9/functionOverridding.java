import javax.sound.midi.Soundbank;

// Function Overridding : when a function of Base class 
abstract class Doctor{
    abstract void treat();
}
class Physician extends Doctor{
    public void treat(){
        System.out.println("I treat Patients with medicide ");
    }
}

class Sergeon extends Doctor{
    public void treat(){
        System.out.println("I treat Patients with sergery ");
    }
}
class Dentist extends Doctor{
    public void treat(){
        System.out.println("I treat Patients teeth ");
    }
}

public class functionOverridding {
    public static void main(String[] args) {
        Doctor doc = null;
        System.out.println("1. Physician 2.Sergeon 3.Dentist :");
        int choice = new java.util.Scanner(System.in).nextInt();

        if(choice ==1) doc = new Physician();
        else if(choice == 2) doc = new Sergeon();
        else if(choice == 3)  doc = new Dentist();

        doc.treat();
    }
}
