import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class construcotPractiseTest {



    @Test
   public void constructorisinitiatedTest() {
        constructorPractise vp=new constructorPractise(26,"vinod","pune");

        assertEquals("wrong age",vp.age,26);
        assertEquals("wrong name",vp.name,"vinod");
    }
}