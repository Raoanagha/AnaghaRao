
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class test
{
    result a;
    public test() {
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
        
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
        a=new result();
    }
    
    @After
    public void tearDown()
    {
    }

   
     @Test
     public void inputdetail()
     {
         assertEquals(1,a.inputdetail("anagha"));
          assertEquals(1,a.inputdetail(" "));
     }
     
      @Test
     public void inputmarks()
     {
         assertEquals(1,a.inputmarks(1,2,3,4,5,6));
         assertEquals(1,a.inputmarks(1,2,3,4,5,'a'));
     }
     
     
      @Test
     public void total()
     {
         assertEquals(50,a.total(10,10,10,10,10));
         assertEquals(100,a.total(10,20,30,20,20));
     }
     
     @Test
      public void classtopper()
     {
         assertEquals(100,a.classtopper(100,50,30,27,60));
         assertEquals(350,a.classtopper(70,200,100,350,300));
     }
}