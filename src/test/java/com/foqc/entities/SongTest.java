/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foqc.entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author foqc
 */
public class SongTest {

    /**
     * Test of listenSong method, of class Song with value (brr).
     */
    @Test
    public void testListenSong() {
        System.out.println("listenSong");
        String sound = "brr";
        Song instance = new Song();
        String expResult = "fiu, cric-cric, brrah";
        String result = instance.listenSong(sound);
        assertEquals(expResult, result);
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of listenSong method, of class Song with value (birip).
     */
    public void testListenSong1() {
        System.out.println("listenSong");
        String sound = "birip";
        Song instance = new Song();
        String expResult = "trri-trri, croac";
        String result = instance.listenSong(sound);
        assertEquals(expResult, result);
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of listenSong method, of class Song with value (plop).
     */
    @Test
    public void testListenSong3() {
        System.out.println("listenSong");
        String sound = "plop";
        Song instance = new Song();
        String expResult = "cric-cric, brrah";
        String result = instance.listenSong(sound);
        assertEquals(expResult, result);
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of listenSong method, of class Song with value (croac).
     */
    @Test
    public void testListenSong4() {
        System.out.println("listenSong");
        String sound = "croac";
        Song instance = new Song();
        String expResult = "";
        String result = instance.listenSong(sound);
        assertEquals(expResult, result);
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }

}
