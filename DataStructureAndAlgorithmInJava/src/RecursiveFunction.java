public class RecursiveFunction {
    //Recursion is function that call itself.
    //Its the repetition of a procedure
    public static void main(String[] args) {
        System.out.println(power(2,8));

        //System.out.println(factorial(7));
    }

    private static int power(int base, int exponent) {
        if (exponent < 1) return 1; //base case
        return base * power(base, exponent -1); //recursive case
    }

//    private static int factorial(int num) {
//        if(num < 1) return 1; //base case
//        return num * factorial(num - 1); // recursive case
//    }
}
