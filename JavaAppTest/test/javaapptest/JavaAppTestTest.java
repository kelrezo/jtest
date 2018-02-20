/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapptest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author travis
 */
public class JavaAppTestTest {
    
    public JavaAppTestTest() {
    }
 
    @Test
    public void testAdd() {
        System.out.println("add1");
        int x = 1;
        int y = 0;
        JavaAppTest instance = new JavaAppTest();
        int expResult = 1;
        int result = instance.add(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testSub() {
        System.out.println("subb");
        int x = 0;
        int y = 0;
        JavaAppTest instance = new JavaAppTest();
        int expResult = 0;
        int result = instance.sub(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
