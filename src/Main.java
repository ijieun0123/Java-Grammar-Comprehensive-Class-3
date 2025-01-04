public class Main {
    public static void main(String[] args) {

        // step 4
        Calculator calculator1 = new Calculator(new AddOperation());
        System.out.println(calculator1.calculate(2, 4));

        Calculator calculator2 = new Calculator(new SubstractOperation());
        System.out.println(calculator2.calculate(2, 4));

        Calculator calculator3 = new Calculator(new MultiplyOperation());
        System.out.println(calculator3.calculate(2, 4));

        Calculator calculator4 = new Calculator(new DivideOperation());
        System.out.println(calculator4.calculate(2, 4));
    }
}