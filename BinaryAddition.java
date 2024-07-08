package simple;

public class BinaryAddition {
    public static void main(String[] args) {
        String binary1 = "1010";  
        String binary2 = "1101";  

        // Convert binary strings to integers
        int number1 = Integer.parseInt(binary1, 2);
        int number2 = Integer.parseInt(binary2, 2);

        // Add the two numbers
        int sum = number1 + number2;

        // Convert the sum back to a binary string
        String binarySum = Integer.toBinaryString(sum);

        
        System.out.println("Sum of " + binary1 + " and " + binary2 + " is " + binarySum);
    }
}

