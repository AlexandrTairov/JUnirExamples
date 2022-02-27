package utils;

// JUnit 4
import org.junit.Test;

// JUnit Jupiter (part of JUnit 5)
//import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MessageUtilTest {

    @Test(timeout = 1000)
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        String message = "Message text";
//        fail("Fail method");
        assertEquals(message, new MessageUtil(message).printMessage());
    }

    @Test(expected = ArithmeticException.class)
    public void testPrintDivisionMessage(){
        System.out.println("Inside testPrintDivisionMessage");
        new MessageUtil().printDivisionMessage(5, 0);
    }

}
