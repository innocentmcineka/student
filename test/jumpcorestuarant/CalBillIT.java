/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumpcorestuarant;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Innocent Mcineka1
 */
public class CalBillIT {
    
    public CalBillIT() {
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
     * Test of CalBill method, of class CalBill.
     */
    @Test
    public void testCalBill() {
        System.out.println("CalBill");
        CalBill instance = new CalBill();
        instance.CalBill();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewOrder method, of class CalBill.
     */
    @Test
    public void testViewOrder() {
        System.out.println("viewOrder");
        int VOrder = 0;
        int Bill = 0;
        String Food = "";
        CalBill.viewOrder(VOrder, Bill, Food);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
