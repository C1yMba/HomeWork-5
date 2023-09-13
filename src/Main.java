import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        {
            //Task 1
            int [] numbers = new int []{1, 2, 3};

            double[] fractional = {1.57, 7.654, 9.986};

            int[] numberOfHomeworks = {1, 2, 3, 4, 5, 6, 7};

            //Task2

            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i]);
                if (i != numbers.length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();

            for (int i = 0; i < fractional.length; i++) {
                System.out.print(fractional[i]);
                if (i != fractional.length - 1) {
                    System.out.print(",");
                }
            }

            System.out.println();

            for (int i = 0; i < numberOfHomeworks.length; i++) {
                System.out.print(numberOfHomeworks[i]);
                if (i != numberOfHomeworks.length - 1) {
                    System.out.print(",");
                }
            }

            //Task 3

            System.out.println();

            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.print(numbers[i]);
                if (i != 0) {
                    System.out.print(",");
                }
            }
            System.out.println();

            for (int i = fractional.length - 1; i >= 0; i--) {
                System.out.print(fractional[i]);
                if (i != 0) {
                    System.out.print(",");
                }
            }

            System.out.println();

            for (int i = numberOfHomeworks.length - 1; i >= 0; i--) {
                System.out.print(numberOfHomeworks[i]);
                if (i != 0) {
                    System.out.print(",");
                }
            }

            System.out.println();

            //Task 4

            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] % 2 != 0 ) {
                    numbers[i] += 1;
                }
            }

            System.out.println(Arrays.toString(numbers));



        }


    }
}