
public class array{
    public static void main(String[] args) {
        // 2d array Demonstration
        // initialization of @D array
        // int marks[][]= new int[3][5];
        // this will create a 2D array of Shape 3 Rows and 5 Columns.
 //Alternatively you can Directly Initialize Values to 2D Arrays

//  int marks1[][] ={
//     {10,20,30,40,50},
//     {60,70,80,90,100},
//     {110,120,130,140,150}
//  };

 // both the above expression will create a 2d array of Shape 3 rows and 5 cols
// Indexing Demonstration
// System.out.println(marks1[0][0]);

    int testArr1[][]= {{1,2,3},{4,5,6},{7,8,9}};

    // let us write a nested loop to print Array.
// to print a 2D Matrix , design first loop counter as Row Index
// design Inner loop counter as Column Index.

    for (int row = 0; row <= testArr1.length; row++) {
        for (int col = 0; col <=testArr1.length; col++) {
            System.out.println(testArr1[row][col]+ " ");
        }
        System.out.println();
    }


    }
}
