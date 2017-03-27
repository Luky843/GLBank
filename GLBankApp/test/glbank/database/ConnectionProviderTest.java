/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glbank.database;

import glbank.Employee;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lukas.oros
 */
public class ConnectionProviderTest {
    
    public ConnectionProviderTest() {
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
     * Test of isEmployeePasswordValid method, of class ConnectionProvider.
     */
     @Test
    public void testIsEmployeePasswordValid1() {
        System.out.println("isEmployeePasswordValid");
        String username = "admin";
        String password = "root";
        ConnectionProvider instance = new ConnectionProvider();
        boolean expResult = true;
        boolean result = instance.isEmployeePasswordValid(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void testIsEmployeePasswordValid2() {
        System.out.println("isEmployeePasswordValid");
        String username = "lukas";
        String password = "admin";
        ConnectionProvider instance = new ConnectionProvider();
        boolean expResult = true;
        boolean result = instance.isEmployeePasswordValid(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void testIsEmployeePasswordValid3() {
        System.out.println("isEmployeePasswordValid");
        String username = "";
        String password = "Secret";
        ConnectionProvider instance = new ConnectionProvider();
        boolean expResult = true;
        boolean result = instance.isEmployeePasswordValid(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeeId method, of class ConnectionProvider..
     */
    @Test
    public void testGetEmployeeId() {
        System.out.println("getEmployeeId");
        String username = "SecondUser";
        ConnectionProvider instance = new ConnectionProvider();
        int expResult = -1;
        int result = instance.getEmployeeId(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDateTime method, of class ConnectionProvider.
     
    @Test
    public void testGetDateTime() {
        System.out.println("getDateTime");
        ConnectionProvider instance = new ConnectionProvider();
        String expResult = "";
        String result = instance.getDateTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*///end

    /**
     * Test of logEmployeeAccess method, of class ConnectionProvider.
     
    @Test
    public void testLogEmployeeAccess() {
        System.out.println("logEmployeeAccess");
        int id = 2;
        ConnectionProvider instance = new ConnectionProvider();
        instance.logEmployeeAccess(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } //end*/

    /**
     * Test of getEmployee method, of class ConnectionProvider.
     */
    @Test
    public void testGetEmployee() {
        System.out.println("getEmployee");
        int id = 2;
        ConnectionProvider instance = new ConnectionProvider();
        Employee result = instance.getEmployee(id);
        assertEquals("Petra", result.getFirstname());
        assertEquals("Novotna", result.getLastname());
        assertEquals(2, result.getIdemp());
        assertEquals("petra.novotna@gmail.com", result.getEmail());
        assertEquals('C', result.getPosition());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
