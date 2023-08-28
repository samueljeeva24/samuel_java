package Project2_ques3;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int oddSquaresSum = Arrays.stream(numbers)
            .filter(number -> number % 2 != 0) // Filter odd numbers
            .map(oddNumber -> oddNumber * oddNumber) // Square the odd numbers
            .sum(); // Calculate the sum of squared odd numbers

        System.out.println(oddSquaresSum); // Output: 35
    }


}
