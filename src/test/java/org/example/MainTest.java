package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Main.dia_laboral;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void testDia_laboral() {
        assertEquals(true,dia_laboral("Martes"));
    }
    @Test
    void testDia_laboral1() {
        assertEquals(true,dia_laboral("Lunes"));
    }
    @Test
    void testDia_Laboral2() {
        assertEquals(true,dia_laboral("Miercoles"));
    }
    @Test
    void testDia_Laboral3(){
        assertEquals(true,dia_laboral("Jueves"));
    }
    @Test
    void testDia_Laboral4(){
        assertEquals(true,dia_laboral("Viernes"));
    }
    @Test
    void testDia_Laboral5(){
        assertEquals(false,dia_laboral("Sabado"));
    }
    @Test
    void testDia_Laboral6(){
        assertEquals(false,dia_laboral("Domingo"));
    }
    @Test
    void testDia_Laboral7(){
        assertEquals(false,dia_laboral("Juernes"));
    }

}