import org.testng.annotations.BeforeMethod;

public class TestInit {
    public boolean isInited = false;

    @BeforeMethod
    public void runBefore(){
        isInited = true;


    }


}
