package UnitAndFunctionalTests.Mockito;

public class AreaFinderMockito {

    private final CalculatorMockito calculator;

    public AreaFinderMockito(CalculatorMockito calculator) {
        this.calculator = calculator;
    }
    public double getAreaOfCircle(double radius) {
        if(radius > 0)
            return calculator.multiply(Math.PI, calculator.square(radius));
        else if(radius < 0)
            throw new IllegalArgumentException();
        else
            return 0;
    }



}
