
import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {


    public static void main(String[] args) {
        int readInt = readInteger();
        int[] readEle = readElement(readInt);

        System.out.println("Integer Arrays = "+ Arrays.toString(readEle));
        System.out.println("Minimum Element is = "+findMin(readEle));
    }

    private static int readInteger() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter integer capacity: ");
        int capacity = scanner1.nextInt();
        scanner1.nextLine();
        return capacity;
    }
    private  static int[] readElement(int readInt) {
        Scanner scanner2 = new Scanner(System.in);
        int[] array = new int[readInt];
        for(int i = 0; i<array.length;i++) {
            System.out.println("Enter number: ");
            int number = scanner2.nextInt();
            scanner2.nextLine();
            array[i] = number;
        }

        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int i =0;i < array.length;i++) {
            int value = array[i];
            if(value < min) {
                min = value;
            }
        }
        return min;
    }
}
