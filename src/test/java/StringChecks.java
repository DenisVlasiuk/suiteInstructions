import org.testng.Assert;
import org.testng.annotations.Test;

public class StringChecks extends TestInit {

    @Test
    public void checkString(){
        Assert.assertTrue(("123"+"123").equals("123123"));

    }

}
