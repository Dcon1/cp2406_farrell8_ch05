import javax.swing.*;

public class EvenOdd {
    public static void main(String[] args) {
        String userInput;
        int number;
        userInput = JOptionPane.showInputDialog("Enter an Interger to check for odd or even");
        number = Integer.parseInt(userInput);
        if(number % 2 == 0)
            System.out.println("You have chosen an even number");
        else
            System.out.println("You have chosen an odd number");
    }
}
