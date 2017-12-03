import org.junit.Test;


import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertEquals;

public class this_practiseTest {

    @Test
    public void sameparameter(){
        this_practise ts1= new this_practise(45,"pri",true);
        assertEquals("everything is good",ts1.name,"pri");


    }
}
