public class Main {

    public static void main(String[] args) {
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println(calculator.getAdditionResult());
//        System.out.println(calculator.getSubtractionResult());

//        Floor floor = new Floor(2.75,4.0);
//        Carpet carpet = new Carpet(3.5);
//        Calculator calculator = new Calculator(floor,carpet);
//        System.out.println(calculator.getTotalCost());

        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber number = new ComplexNumber(2.5,-1.5);
        one.add(1,1);
        System.out.println(one.getReal());
        System.out.println(one.getImaginary());
        one.subtract(number);
        System.out.println(one.getReal());
        System.out.println(one.getImaginary());
        number.subtract(one);
        System.out.println(number.getReal());
        System.out.println(number.getImaginary());

    }



}
