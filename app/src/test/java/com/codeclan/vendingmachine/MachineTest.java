package com.codeclan.vendingmachine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class MachineTest {
    Machine vending;




    @Before
    public void before(){
        vending = new Machine();

    }

    @Test
    public void testStartingBalance(){
        assertEquals(0, vending.getBalance());
    }

    @Test
    public void testAddNickel(){
        vending.addNickel();
        assertEquals(5, vending.getBalance());
    }

    @Test
    public void testAddDime(){
        vending.addDime();
        assertEquals(10, vending.getBalance());
    }
    @Test
    public void testAddQuarter(){
        vending.addQuarter();
        assertEquals(25, vending.getBalance());
    }

    @Test
    public void testAddDollar() {
        vending.addDollar();
        assertEquals(100, vending.getBalance());
    }

    @Test
    public void testBalanceAfterCoinReturn(){
        vending.addDime();
        vending.addDollar();
        vending.coinReturn();
        assertEquals(0,vending.getBalance());
    }

    @Test
    public void testBalanceReducedCorrectlyByCostItemA(){
        vending.addDollar();
        vending.addDollar();
        vending.getItemA();
        assertEquals(135,vending.getBalance());
    }

    @Test
    public void testBalanceReducedCorrectlyByCostItemB(){
        vending.addDollar();
        vending.addDollar();
        vending.getItemB();
        assertEquals(100,vending.getBalance());
    }

    @Test
    public void testBalanceReducedCorrectlyByCostItemC(){
        vending.addDollar();
        vending.addDollar();
        vending.getItemC();
        assertEquals(50,vending.getBalance());
    }

//    @Test
//    public void testCan

}