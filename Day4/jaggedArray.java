public class jaggedArray {
    public static void main(String[] args) {
        int[][] testArr = {
            {10,20,30,40,50},
            {70,80,90},
            {100}
        };
        // System.out.println(testArr.length);
        // print jagged array
        for (int i = 0; i <testArr.length; i++) {
            for (int j = 0; j < testArr[i].length; j++) {
               System.out.print(testArr[i][j] + " ");
            }
            System.out.println();
        }

        // using foreach loop
        for (int[] array1D : testArr) {
            for (int element : array1D) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
