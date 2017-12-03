import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class staticpractTest {

    @Test
    public void staticTest(){
        staticprac sp=new staticprac(26,"vinodd");
        sp.method();
        assertEquals("name is not coorect",sp.company,"delloite");


    }


}
