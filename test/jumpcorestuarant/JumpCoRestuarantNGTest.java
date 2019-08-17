/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumpcorestuarant;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Innocent Mcineka1
 */
public class JumpCoRestuarantNGTest {
    
    public JumpCoRestuarantNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of tblEmployee method, of class JumpCoRestuarant.
     */
    @Test
    public void testTblEmployee() throws Exception {
        System.out.println("tblEmployee");
        JumpCoRestuarant.tblEmployee();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tblCustomer method, of class JumpCoRestuarant.
     */
    @Test
    public void testTblCustomer() throws Exception {
        System.out.println("tblCustomer");
        JumpCoRestuarant.tblCustomer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class JumpCoRestuarant.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        JumpCoRestuarant.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
