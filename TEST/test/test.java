/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
      
      @Test
       public void classpass()
     {
         assertEquals(1,a.classpass(300));
          assertEquals(0,a.classpass(150));
     }
       
       @Test
         public void mathtopper()
     {
         assertEquals(250,a.mathtopper(100,50,30,250,60));
         assertEquals(350,a.mathtopper(250,20,100,350,30));
     }
         
         @Test
           public void mmctopper()
     {
         assertEquals(200,a.mmctopper(200,50,30,27,60));
         assertEquals(300,a.mmctopper(70,100,100,150,300));
     }
          
           @Test
             public void dbmstopper()
     {
         assertEquals(500,a.dbmstopper(100,500,30,270,300));
         assertEquals(350,a.dbmstopper(70,200,100,350,300));
     }
           
             @Test
               public void daatopper()
     {
         assertEquals(600,a.daatopper(100,500,250,27,600));
         assertEquals(300,a.daatopper(70,200,100,250,300));
     }
               
               @Test
                 public void ostopper()
     {
        assertEquals(100,a.ostopper(100,50,30,27,60));
         assertEquals(350,a.ostopper(70,200,100,350,300));
     }
                 
                 @Test
                 public void mathsubjpass()
                 {
                     assertEquals(0,a.mathsubjpass(56));
                     assertEquals(1,a.mathsubjpass(20));
                 }
                 
                 @Test
                  public void mmcsubjpass()
                 {
                     assertEquals(0,a.mmcsubjpass(56));
                     assertEquals(1,a.mmcsubjpass(20));
                 }
                  
                  @Test
                   public void daasubjpass()
                 {
                     assertEquals(0,a.daasubjpass(56));
                     assertEquals(1,a.daasubjpass(20));
                 }
                   
                   @Test
                    public void dbmssubjpass()
                 {
                     assertEquals(0,a.dbmssubjpass(56));
                     assertEquals(1,a.dbmssubjpass(20));
                 }
                    
                    @Test
                     public void ossubjpass()
                 {
                     assertEquals(0,a.ossubjpass(56));
                     assertEquals(1,a.ossubjpass(20));
                 }
}
