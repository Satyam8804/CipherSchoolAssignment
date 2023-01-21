import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

// package Day8;

class Products{
    int pId ;
    String pName;
    double price;
    String category;

    Products(int id ,String name , double price , String category){
        this.pId = id;
        this.pName = name;
        this.price = price;
        this.category = category;
    }
    @Override
	public String toString() {
		return this.pId+" " + this.pName+" " + this.price + " " + this.category;
	}

}
public class Activity1 {
    public static void main(String[] args) {
        Products p1 = new Products(1, "Soap", 30, "houseHold");
        Products p2 = new Products(2, "Tea", 100, "Grocery");
        Products p3 = new Products(3, "Bread", 20, "Grocery");

        Products[] products = new Products[]{p1,p2,p3};

        Stream<Products> proStream = Arrays.stream(products);

        System.out.println("Enter Category to search Product:");
        Scanner sc = new Scanner(System.in);

        String category1 = sc.nextLine();

        proStream.filter(e->e.category.equals(category1)).map(name->name.pName)
        .forEach(e->System.out.println(e.toString()));


    }
}
