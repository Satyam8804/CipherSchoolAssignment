//Satyam Kumar (12018969)
// package Day8;

    class Invoice{
        String name ;
        String description;
        int quantity;
        double price;

        Invoice(){
            this.name ="Screwdriver";
            this.description ="Use to Unscrew the screw";
            this.quantity = 5;
            this.price = 100.0;
        }
        public void set( String name ,String description,int quantity,double price){
            this.name = name;
            this.description = description;
            this.quantity = quantity;
            this.price = price;
        }
        public String get(){
        
            return " Name : "+ name +"\n Description : "+ description +"\n Quantity : "+quantity +"\n price :"+price;
        }
        public double getInvoiceAmount(){
            if(quantity <0 || price <0){
                this.quantity =0;
                this.price =0.0;
            }
            return price*quantity;
        }
    }
public class D8p2 {
    public static void main(String[] args) {
        Invoice InvoiceTest = new Invoice();
        InvoiceTest.set("Tap", "use for water supply", 2, 1200);
        System.out.println(InvoiceTest.get());
        System.out.println(" Total Cost : "+InvoiceTest.getInvoiceAmount());

    }
}
