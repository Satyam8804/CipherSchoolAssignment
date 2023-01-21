/*
 * Encapsulation

Encapsulation is a Pratice of Defining the Access of Help us Expose Data Members & Functions is Practiced by using Access Modifiers Class Members to right Security Level. getters & Setters.
 */

 class PhonePay{
    private float serviceCharge = .05f;
    float gerServiceCharge(){
        return serviceCharge;
    }
    void setServiceCharge(float newCharge){
        if(newCharge < .05f){
            System.out.println("ouch ! Service charge is not less than  5% .");
        }
        serviceCharge = newCharge;
    }
 }
 class Customer{
    void pay(int bill){
        PhonePay phonePay = new PhonePay();
        phonePay.setServiceCharge(.01f);

        float phonePayCharge = bill*phonePay.gerServiceCharge();

        float finalCharge = bill + phonePayCharge;

        System.out.println(String.format("Bill %s  , phonePay Service Charge %s , final Amount %s", bill, phonePayCharge, finalCharge));
    }
 }

 public class Encapsulation {
    public static void main(String[] args) {
        Customer sanjeev = new Customer();
        sanjeev.pay(1000);
    }
    
 }