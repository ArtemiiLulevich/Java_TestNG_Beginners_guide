package UnitAndFunctionalTests.Mockito;


import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.Mockito.when;


public class AreaFinderMockitoTest {

    @InjectMocks public AreaFinderMockito areaFinder;
    @Mock public CalculatorMockito calculator ;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        areaFinder = new AreaFinderMockito(calculator);
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void
            getAreaOfCircleShouldThrowIllegalArgumentExceptionForNegativeRadius() {
        areaFinder.getAreaOfCircle(-1.2);
    }
    @Test
    public void getAreaOfSquareShouldReturnExpectedValue() {
        final double radius = 4.1;
        final double radiusSquare = 5.3;
        final double expectedArea = 10.9;
//Mocking the Calculator methods and returning particular values.
        when(calculator.square(radius)).thenReturn(radiusSquare);
        when(calculator.multiply(Math.PI, radiusSquare)).thenReturn(expectedArea);
        Assert.assertEquals(areaFinder.getAreaOfCircle(radius),
                expectedArea, 0);
    }

}
