package buckyjava.T33_34_multiDimentialArray;

public class MultidimensionalArray {
    public static void main(String[] args) {

        /*first   [] is the row
          secondArray  [] is the column
          first set of {8,9,10,11}
          secondArray set of row {12,13,14,15}
         */
        int firstArray[][]   = {{8,9,10,11},{12,13,14,15}};
        int secondArray[][]  = {{30,31,32,33},{43},{4,5,6}};

        System.out.println("first Array");
        display(firstArray);
        System.out.println("second Array");
        display(secondArray);

    }

    public static void display(int x[][]){
        /*
            first loop through the rows
            second loop through the columns
         */
        for (int row = 0; row <x.length ; row++) {
            for (int column = 0; column < x[row].length ; column++) {
                System.out.print(x[row][column]+" "+"\t");
            }
            System.out.println();
        }
    }

}
