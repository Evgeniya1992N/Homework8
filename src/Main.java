import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Task 1
        int[] arrayOne = new int[]{1, 2, 3};
        double[] arrayTwo = {1.57, 7.654, 9.986};
        boolean[] arrayThree = new boolean[]{true, false, true};
        //Task 2
        for (int i = 0; i < 3; i++) {
            if (i == arrayOne.length - 1) {
                System.out.println(arrayOne[i]);
                break;
            }
            System.out.print(arrayOne[i]+", ");
            }

        for (int i = 0; i < 3; i++) {
            if (i == arrayTwo.length - 1) {
                System.out.println(arrayTwo[i]);
                break;
            }
            System.out.print(arrayTwo[i]+", ");
            }
        for (int i = 0; i < 3; i++) {
            if (i == arrayThree.length -1 ) {
                System.out.println(arrayThree[i]);
                break;
            }
            System.out.print(arrayThree[i]+", ");
            }

        //Task 3
        for (int i = 2; i >=0; i--) {
            if (i == 0 ) {
                System.out.println(arrayOne[i]);
                break;
            }
            System.out.print(arrayOne[i] + " ,");
        }

        for (int i = 2; i >= 0; i--) {
            if (i == 0 ) {
                System.out.println(arrayTwo[i]);
                break;
            }
            System.out.print(arrayTwo[i]+", ");
        }
        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayThree[i]);
                break;
            }
            System.out.print(arrayThree[i]+", ");
        }

        //Task 4;
        for (int i = 0; i <= arrayOne.length; i++) {
            if (i == arrayOne.length - 1) {
                System.out.println(arrayOne[i]);
                break;
            }
            if (arrayOne[i] % 2 != 0) {
                arrayOne[i] = arrayOne[i] + 1;
        }
            System.out.print(arrayOne[i] + ", ");
        }

        System.out.println(Arrays.toString(arrayOne));
    }
}