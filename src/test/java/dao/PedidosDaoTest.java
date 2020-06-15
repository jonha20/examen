/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static com.sun.javafx.image.impl.ByteBgraPre.ToByteBgraConv.instance;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author jonathan
 */
public class PedidosDaoTest {

    
    
    
    public PedidosDaoTest() {
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
     * Test of getConexion method, of class PedidosDao.
     */
    @Test
    public void testGetConexion(){
        PedidosDao instance = new PedidosDao();
        Connection result = instance.getConexion();
        Connection expResult = null;
        assertNotEquals(expResult,result);
    }

    /**
     * Test of read method, of class PedidosDao.
     */
    @Test
    public void testRead() {
        System.out.println("Test Read");
        PedidosDao instance = new PedidosDao();
        Pedido expResult = instance.read(10272);
        Pedido result = instance.read(10272);
        assertEquals(result.getId(),expResult.getId());
        assertEquals(result.getCliente_id(),expResult.getCliente_id());
        assertEquals(result.getEmpleado_id(),expResult.getEmpleado_id());
        
        Pedido expResult_1 = null;
        Pedido result_1 = instance.read(1085486);
        assertEquals(expResult_1,result_1);
    }

    /**
     * Test of insert method, of class PedidosDao.
     */
    @Test
    public void testInsert() {
        System.out.println("Test Insert");
        PedidosDao instance = new PedidosDao();
        Date dia1 = new Date(1996-07-19);
        Date dia2 = new Date(1996-07-17);
        Date dia3 = new Date(1996-07-18);
        BigDecimal bd = new BigDecimal(125.351);
        Pedido pedido = new Pedido(11076, 5, 9, dia1, dia2, dia3,3,bd, "try", "try", "try", "try", "try", "try");
        Integer expResult = null;
        Integer result = instance.insert(pedido);
        assertNotEquals(expResult,result);
        instance.delete(result);
        
        Pedido pedido2 = new Pedido(13149, 5, 9, dia1, dia2, dia3,6,bd, "try", "try", "try", "try", "try", "try");
        Integer expResult2 = null;
        Integer result2 = instance.insert(pedido2);
        assertEquals(expResult2,result2);
    }

    /**
     * Test of update method, of class PedidosDao.
     */
    @Test
    public void testUpdate() {
        System.out.println("Test Update");
        PedidosDao instance = new PedidosDao();
        Date dia1 = new Date(1996-07-19);
        Date dia2 = new Date(1996-07-17);
        Date dia3 = new Date(1996-07-18);
        BigDecimal bd = new BigDecimal(2254.789);
        Pedido pedido = new Pedido(11076, 5, 9, dia1, dia2, dia3,3,bd, "try", "try", "try", "try", "try", "try");
        Integer resultinsertar = instance.insert(pedido);
        Integer expResult = 1;
        
        Pedido pedidoact = new Pedido(resultinsertar, 5, 9, dia1, dia2, dia3,3,bd, "try", "try", "try", "try", "try", "try");
        Integer result = instance.update(pedidoact);
        assertEquals(expResult,result);
        
        Pedido pedidoNO = new Pedido(resultinsertar, 5, 9, dia1, dia2, dia3,8,bd, "try", "try", "try", "try", "try", "try");
        Integer resultNO = instance.update(pedidoNO);
        assertNotEquals(expResult,resultNO);
        
        instance.delete(resultinsertar);
        
        
    }

    /**
     * Test of delete method, of class PedidosDao.
     */
    @Test
    public void testDelete() {
        System.out.println("test Delete");
        PedidosDao instance = new PedidosDao();
        Date dia1 = new Date(1996-07-19);
        Date dia2 = new Date(1996-07-17);
        Date dia3 = new Date(1996-07-18);
        BigDecimal bd = new BigDecimal(2254.789);
        Pedido pedido = new Pedido(11076, 5, 9, dia1, dia2, dia3,3,bd, "try", "try", "try", "try", "try", "try");
        Integer resultins = instance.insert(pedido);
        Integer expResult = 1;
        Integer result = instance.delete(resultins);
        assertEquals(expResult,result);
        
        Integer expResult_1 = 0;
        Integer result_1 = instance.delete(999999999);
        assertEquals(expResult_1,result_1);
        
        Integer expResult_2 = 0;
        Integer result_2 = instance.delete(11124);
        assertEquals(expResult_2,result_2);
    }

    /**
     * Test of listar method, of class PedidosDao.
     */
    @Test
    public void testListar() {
        System.out.println("test Listar");
        PedidosDao instance = new PedidosDao();
        Integer pos = 1;
        ArrayList<Pedido> expResult = null;
        ArrayList<Pedido> result = instance.listar(pos);
        assertNotEquals(expResult,result);
    }
    
}
