class Calculator{
    //ensuring encapsulation by making the variable private
    private int a;


    //constructor
    public Calculator(){
        System.out.println("Calculator is ready to use.");
    }

    //parameterized constructor
    public Calculator(int a, int b){
        System.out.println("Calculator initialized with values: " + a + " and " + b);
    }

    public Calculator(Calculator other){
        this();
        System.out.println("Calculator copied from another instance: " + other.add(12, 12));
    }
    
    //instance method
    public int add(int a, int b){
        return a + b;
    }

    //static method
    static public int subtract(int a, int b){
        return a - b;
    }

    // getter for 'a'
    public int getA() {
        return a;
    }

    //setter for 'a'
    public void setA(int a) {
        this.a = a;
    }
}

class Advcalculator extends Calculator {
    
}

public class First {
    public static void main(String[] args) {
        //object creation
        Calculator calc = new Calculator();

        //object creation with default parameters
        Calculator calcWithParams = new Calculator(10, 20);

        //object creation using copy constructor
        Calculator calcWithParams2 = new Calculator(calcWithParams);
        int result = calc.add(5, 3);
        int resultWithParams = calcWithParams.add(1, 2);
        int resultWithParams2 = calcWithParams2.add(4, 6);
        System.out.println("The sum is (resultWithParams): " + resultWithParams);
        System.out.println("The sum is (resultWithParams2): " + resultWithParams2);
        System.out.println("The sum is: " + result);


        //static method call
        int subtractionResult = Calculator.subtract(10, 5);
        System.out.println("The subtraction result is: " + subtractionResult);

        //demonstrating encapsulation
        //calc.a = 10; // This line would cause a compilation error because 'a' is private
        System.out.println("The value of 'a' is: " + calc.getA());
        calc.setA(10);
        System.out.println("The value of 'a' after modification: " + calc.getA());

        calcWithParams.setA(20);
        System.out.println("The value of 'a' after modification: " + calc.getA() + ", " + calcWithParams.getA());
    }
}