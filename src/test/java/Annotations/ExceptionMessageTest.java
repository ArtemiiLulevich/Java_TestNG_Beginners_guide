package Annotations;

import org.testng.annotations.Test;

import java.io.IOException;

public class ExceptionMessageTest {
    /**
     * Verifies the exception message based on the exact error
     message thrown.
     */
    @Test(expectedExceptions={IOException.class},
            expectedExceptionsMessageRegExp="Pass Message test")
    public void exceptionMsgTestOne() throws Exception{
        throw new IOException("Pass Message test");
    }
    /**
     * Verifies the exception message using the regular exception.
     * This test verifies that the exception message contains a
     text "Message" in it.
     */
    @Test(expectedExceptions={IOException.class},
            expectedExceptionsMessageRegExp=".* Message .*")
    public void exceptionMsgTestTwo() throws Exception{
        throw new IOException("Pass Message test");
    }
    /**
     * Verifies the exception message based on the exact error
     message thrown.
     * This is to show that TestNG fails a test when the exception
     message does not match.
     */
    @Test(expectedExceptions={IOException.class},
            expectedExceptionsMessageRegExp="Pass Message test")
    public void exceptionMsgTestThree() throws Exception{
        throw new IOException("Fail Message test");
    }

    @Test(expectedExceptions = {ArithmeticException.class, IOException.class},
            expectedExceptionsMessageRegExp = "/ .*")
    public void exceptionStartsTest() throws Exception{
        int i = 1 / 0;
        throw new IOException();


    }
}
