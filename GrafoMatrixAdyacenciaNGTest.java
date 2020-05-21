/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Diego Alvarez
 */
public class GrafoMatrixAdyacenciaNGTest {
    
    public GrafoMatrixAdyacenciaNGTest() {
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
     * Test of getMAX_VERTICES method, of class GrafoMatrixAdyacencia.
     */
    @Test
    public void testGetMAX_VERTICES() {
        System.out.println("getMAX_VERTICES");
        GrafoMatrixAdyacencia instance = null;
        int expResult = 5;
        int result = instance.getMAX_VERTICES();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult == result){
            System.out.println("Bien, funciona");
        }else{
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of getMAX_ARISTAS method, of class GrafoMatrixAdyacencia.
     */
    @Test
    public void testGetMAX_ARISTAS() {
        System.out.println("getMAX_ARISTAS");
        GrafoMatrixAdyacencia instance = null;
        int expResult = 5;
        int result = instance.getMAX_ARISTAS();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
           if(expResult == result){
            System.out.println("Bien, funciona");
        }else{
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of insertaArista method, of class GrafoMatrixAdyacencia.
     */
    @Test
    public void testInsertaArista() {
        System.out.println("insertaArista");
        int v1 = 0;
        int v2 = 0;
        int dist = 0;
        GrafoMatrixAdyacencia instance = null;
        instance.insertaArista(v1, v2, dist);
        // TODO review the generated test code and remove the default call to fail.
        if((v1 == v2) && (v1 != dist) && (v2 != dist)){
            System.out.println("Bien, funciona");
        }else{
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of tomarValor method, of class GrafoMatrixAdyacencia.
     */
    @Test
    public void testTomarValor() {
        System.out.println("tomarValor");
        int v1 = 0;
        int v2 = 1;
        GrafoMatrixAdyacencia instance = null;
        int expResult = 20;
        int result = instance.tomarValor(v1, v2);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        if((expResult > v1) && (expResult > v2) && (expResult >= 20)){
            System.out.println("Bien, funciona");
        }else{
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getMatrix method, of class GrafoMatrixAdyacencia.
     */
    @Test
    public void testGetMatrix() {
        System.out.println("getMatrix");
        GrafoMatrixAdyacencia instance = null;
        int[][] expResult = null;
        int[][] result = instance.getMatrix();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
         if((expResult != result)){
            System.out.println("Bien, funciona");
        }else{
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of existeArista method, of class GrafoMatrixAdyacencia.
     */
    @Test
    public void testExisteArista() {
        System.out.println("existeArista");
        int v1 = 0;
        int v2 = 1;
        GrafoMatrixAdyacencia instance = null;
        boolean expResult = false;
        boolean result = instance.existeArista(v1, v2);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        if((result != expResult) ){
            System.out.println("Bien, funciona");
        }else{
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of eliminaArista method, of class GrafoMatrixAdyacencia.
     */
    @Test
    public void testEliminaArista() {
        System.out.println("eliminaArista");
        int v1 = 0;
        int v2 = 0;
        GrafoMatrixAdyacencia instance = null;
        instance.eliminaArista(v1, v2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of impMatrix method, of class GrafoMatrixAdyacencia.
     */
    @Test
    public void testImpMatrix() {
        System.out.println("impMatrix");
        GrafoMatrixAdyacencia instance = null;
        instance.impMatrix();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
