/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apabole;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rizki
 */
public class ApaBoleTest {
    
    public ApaBoleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class ApaBole.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ApaBole.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of print method, of class ApaBole.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        int times = 15;
        ApaBole.print(15);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of check method, of class ApaBole.
     */
    @Test
    public void testCheck() {
        System.out.println("check");
        assertEquals("ApaBole", ApaBole.check(15));
        assertEquals("Apa", ApaBole.check(9));
        assertEquals("Bole", ApaBole.check(20));
        assertEquals("7", ApaBole.check(7));
        
    }
    
}
