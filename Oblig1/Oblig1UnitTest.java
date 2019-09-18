//package no.oslomet.cs.algdat.Oblig1;
package Oblig1;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Denne klassen kan du bruke til hjelp under utvikling av din oblig.
 * Lag små og enkle test-eksempler for å teste at metoden din fungerer som ønsket.
 */
class Oblig1UnitTest {

    @org.junit.jupiter.api.Test
    void maks() {
        assertEquals(true, false, "Implementer maks og denne testen");
    }

    @org.junit.jupiter.api.Test
    void ombyttinger() {
        assertEquals(true, false, "Implementer ombyttinger og denne testen");
    }

    @org.junit.jupiter.api.Test
    void antallUlikeSortert() {
        assertEquals(true, false, "Implementer antallUlikeSortert og denne testen");
    }

    @org.junit.jupiter.api.Test
    void antallUlikeUsortert() {
        assertEquals(true, false, "Implementer antallUlikeUsortert og denne testen");
    }

    @org.junit.jupiter.api.Test
    void delsortering() {
        assertEquals(true, false, "Implementer delsortering og denne testen");
    }

    @org.junit.jupiter.api.Test
    void rotasjon() {
        assertEquals(true, false, "Implementer rotasjon og denne testen");
    }

    @org.junit.jupiter.api.Test
    void flett() {

        String test = "aceg";
        String testTo = "bdfh";
        System.out.println(Oblig1.flett(test, testTo));
        assertEquals("abcdefgh", Oblig1.flett(test, testTo), "Implementer flett og denne testen");
    }

    @org.junit.jupiter.api.Test
    void indekssortering() {
        assertEquals(true, false, "Implementer indekssortering og denne testen");
    }

    @org.junit.jupiter.api.Test
    void tredjeMin() {
        int[] demo = {5, 3 ,1, 5,6,7,22,};
        Oblig1.tredjeMin(demo);
        assertEquals(true, false, "Implementer tredjeMin og denne testen");
    }

    @org.junit.jupiter.api.Test
    void bokstavNr() {
        assertEquals(true, false, "Implementer bokstavNr og denne testen");
    }

    @org.junit.jupiter.api.Test
    void inneholdt() {
        String en = "A";
        String to = "nei";
        Oblig1.inneholdt(en, to);
        assertEquals(true, false, "Implementer inneholdt og denne testen");
    }
}