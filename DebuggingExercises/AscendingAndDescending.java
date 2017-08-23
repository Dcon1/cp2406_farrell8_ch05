import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;

public class AscendingAndDescending {
    public static void main(String[] args) {
        int [] numbers;
        numbers = new int[3];
        String userInput;
        userInput = JOptionPane.showInputDialog("Please enter the first number");
        numbers[0] = Integer.parseInt(userInput);
        userInput = JOptionPane.showInputDialog("Please enter the first number");
        numbers[1] = Integer.parseInt(userInput);
        userInput = JOptionPane.showInputDialog("Please enter the first number");
        numbers[2] = Integer.parseInt(userInput);
        System.out.println("Your numbers ");
        Arrays.sort(numbers);
        System.out.println("Sorted numbers are" + Arrays.toString(numbers));
        //Arrays.sort(numbers, Collections.reverseOrder());
        //System.out.println("Sorted numbers are" + Arrays.toString(numbers));
        //Google suggest this would work??!
    }
}
