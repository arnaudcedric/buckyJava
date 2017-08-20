package buckyjava.T35_VariableLengthArguments;
public class VariableLengthArguments {
    /*
    how to make a method and you don't know how many args it can take
     */
    public static void main(String[] args) {

        System.out.println(average(5,5,5,4,4,4,3,3,3)); //in this example numbers.length is 9 because we have 5,5,5,4,4,4,3,3,3 which is nine different number
        System.out.println(average(5,5,5,4,4,4)); //in this example numbers.length is 6 because we have 5,5,5,4,4,4 which is six different number

    }

/*
    i will be putting numbers in here but i don't know if i will put in 2 numbers or five numbers or 500
 */
    public static int average(int...numbers){
        int total = 0;
        for (int x:numbers ) {
            total+=x;
        }
        /*

         */
        return total/numbers.length;

    }

}
