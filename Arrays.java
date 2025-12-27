import java.util.Arrays;

class Array {
     public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};

        int[] copyOfNumbers = Arrays.copyOf(number, number.length);

        System.out.println(Arrays.equals(number, copyOfNumbers));



    }

}