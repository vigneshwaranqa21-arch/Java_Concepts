package Day5OOPS;

public class Multiplyvalues {

    int multiply(int a, int b, int c) {
        int result = a * b * c;
        return result;   // returning the product
    }

    public static void main(String[] args) {

        Multiplyvalues obj = new Multiplyvalues();

        int output = obj.multiply(2, 3, 4);  // calling the method

        System.out.println("Multiplication Result: " + output);
    }
}
