import java.util.Arrays;

public class string {
    public static void main(String[] args) {
        // concatination in string 
        String part1= "Lovely Professional ";
        String part2 ="University";
        String finalResult = part1.concat(part2);
        //  IndexOf Method : this return the index of specified Character
        
        String msg = "Crocodile";
        System.out.println(msg.indexOf("r"));

        // compareTo : is used to compare 2 strings : if it return 0 it means The string are equal

        String testStr1 =" Rockstar";
        String testStr2 ="rockstar";
        System.out.println(testStr1.compareTo(testStr2));

        // to ignore case we can use compareToIgnoreCase 
        System.out.println(testStr1.compareToIgnoreCase(testStr2));

    // Contains Method : this method is used to know whether theh string contains given value 

    System.out.println(msg.contains("roco"));
    // replace Method : this method is used to replce value in a string 
    System.out.println(msg.replace("o", "@"));

    msg = "crocodile";
    System.out.println(msg.substring(1,5));
    //  this will give the character from start till end index 
    // Split : this function slices the string using the specified delimeter
    
    String icecreme = "choclate-rumraisin-vanilla-strawberry";
    String[] flavours  = icecreme.split("-");

    System.out.println(Arrays.toString(flavours));
    }
}
