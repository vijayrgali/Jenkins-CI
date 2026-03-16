import org.junit.Test;
import static org.junit.Assert.*;
public class HelloTest {
    @Test
    public void textMessage(){
        String msg = "From";
        assertEquals("From", msg);
    }
}
