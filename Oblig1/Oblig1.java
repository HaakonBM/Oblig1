package Oblig1;

////// Løsningsforslag Oblig 1 - 2019 ////////////////////////

import com.sun.xml.internal.bind.v2.TODO;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;


public class Oblig1 {
    private Oblig1() {
    }

    ///// Oppgave 1 //////////////////////////////////////

    /*Spørsmål til oppgaven
- Når blir det flest ombyttinger?
Det blir flest ombyttinger når den største verdien ligger først. Da vil den flyttes bakover ved hver eneste
sammenligning. Det vil bli n -1 sammenligninger og like mange ombyttinger
- Når blir det færrest ombyttinger?
Det blir færrest ombyttinger når tabellen er allerede er sortert i stigende rekkefølge. Da vil ha n- 1
sammenlikniger og ingen ombyttinger.
- Hvor mange ombyttiger er det gjennomsnittlig?
 */

    public static int maks(int[] array) {

        if (array.length <= 0) {
            throw new java.util.NoSuchElementException("Tabellen er tom!");
        }

        int j = 1;
        int tempInt;

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] > array[j]) {
                tempInt = array[i];
                array[i] = array[j];
                array[j] = tempInt;
            }
            j++;
        }

        return array[array.length - 1];
    }

    public static int ombyttinger(int[] array) {

        int antallOmbyttinger = 0;
        int hjelpeTeller = 1;
        int tempInt = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[hjelpeTeller]) {
                tempInt = array[i];
                array[i] = array[hjelpeTeller];
                array[hjelpeTeller] = tempInt;
                antallOmbyttinger++;
            }
            hjelpeTeller++;
        }
        return antallOmbyttinger;
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int [] a){

        int antall=0;
        int tall =0; // variablen tall står for hver element i tabellen,
        //men variablen må starte fra 0, i tilfelle vi har 0 i tabellen
        // tall = {0,3,3,4,5,6,7,7,7,8} og a = {3,3,4,5,6,7,7,7,8}
        for (int i= 0; i < a.length; i++ ){

            // if statmentene retunerer  hver tall som ikke er like. dvs tall = a [i]
            if (a [i] >= tall ) {
                if (a [i]!= tall){
                    antall++;
                }//end inner if
            }// end outer if

            // i tilfelle tabellen er tom
            else if (a.length < 1){
                return 0;
            }// end if

            // hvis a [i]> a [i+1]
            else {
                throw new IllegalStateException(" Tabellen er ikke stigende soretert ");
            }
            tall = a [i];
        }// end for
        return antall;
    }// end antall ulike sortering


    ///// Oppgave 3 //////////////////////////////////////

    public static int antallUlikeUsortert(int[] array) {

        if (array.length == 0) {
            return 0;
        } else {

                int antallUnikeTall = 0;
                int antallLike = 1;

                for (int i = 0; i < array.length; i++) {
                    for (int j = i +1; j < array.length; j++) {
                        if (array[i] == array[j]) {
                            antallLike++;
                        }
                    }
                    if (antallLike == 1) {
                        antallUnikeTall++;
                    }
                    antallLike = 1;
                }
                return antallUnikeTall;
            }
        }


    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] arr) {

        int n = arr.length;

        int l = 0, r = n - 1;
        int k = 0;

        while (l < r) {
            while (arr[l] % 2 != 0) {
                l++;
                k++;
            }
            while (arr[r] % 2 == 0 && l < r)
                r--;
            if (l < r) {
                int x = arr[l];
                arr[l] = arr[r];
                arr[r] = x;
            }
        }

        int p = arr.length;

        for (int i = 0; i < k - 1; i++)
            for (int j = 0; j < k - i - 1; j++)
                if (arr[j] > arr[j + 1]) {

                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }

        for (int m = k; m < p - 1; m++)
            if (arr[m] > arr[m + 1]) {
                int midlertidig = arr[m];
                arr[m] = arr[m + 1];
                arr[m + 1] = midlertidig;
            }
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        if (a.length != 0) {

            char[] arr = a;
            int n = 1;

            for (int i = 0; i < n; i++) {
                int j;
                Character last;
                last = arr[arr.length - 1];

                for (j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = last;
            }
        }
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int n) {
            char[] arr = a;
            if (a.length != 0 && n > 0) {
                for (int i = 0; i < n; i++) {
                    int j;

                    Character last;
                    last = arr[arr.length - 1];

                    for (j = arr.length - 1; j > 0; j--) {
                        arr[j] = arr[j - 1];

                    }
                    arr[0] = last;
                }
            }
            else if (a.length != 0 && n < 0) {
                n = 0 - n;
                for (int i = 0; i < n; i++) {
                    int j, first;
                    first = arr[0];
                    for (j = 0; j < arr.length - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    arr[j] = (char) first;
                }
            }
    }

    //test
    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {

        String flettetOrd = "";

        for (int i = 0; i < s.length() || i < t.length(); i++) {
            if (i < s.length()) {
                if (s.charAt(i) == ' ') {
                    flettetOrd += "";
                } else {
                    flettetOrd += s.charAt(i);
                }
            }
            if (i < t.length()) {
                if (t.charAt(i) == ' ') {
                    flettetOrd += "";
                } else {
                    flettetOrd += t.charAt(i);
                }
            }
        }
        return flettetOrd;
    }

    /// 7b)
    public static String flett(String... s) {
        String flettOrd = "";
        if (s.length == 0) {
            return "";
        }

        int lengsteString = 0;
        for (int i = 0; i < s.length; i++) {
            if (lengsteString < s[i].length()) {
                lengsteString = s[i].length();
            }
        }

        for (int i = 0; i <  lengsteString; i++) {
            for (int j = 0;  j < s.length; j++ ) {
                if (i < s[j].length()) {
                    flettOrd += s[j].charAt(i);
                }
            }
        }

        return flettOrd;
    }
    ///// Oppgave 8 //////////////////////////////////////
    /*
    //burde bruke clone
    public static int[] indekssortering(int[] array) {
        if (array.length == 0) {
            int[] arr = new int[0];
            return arr;
        } else {
            int[] arrayCopy = array.clone();
            int[] smallIndex = array.clone();

            for (int i = 0; i < arrayCopy.length; i++) {
                for (int j = i + 1; j < arrayCopy.length; j++) {
                    if (arrayCopy[j] < arrayCopy[i]) {
                        int temp = arrayCopy[i];
                        arrayCopy [i] = arrayCopy[j];
                        arrayCopy[j] = temp;
                        smallIndex[i] = j;
                    }
                }
            }
            System.out.println("Skriver ut array: ");
            for (int i : smallIndex) {
                System.out.print(i + " + ");
            }
            System.out.println("\n");
            return smallIndex;
        }

    }

*/


    public static int[] indekssortering(int[] array) {

        if (array.length == 0) {
            int[] zeroArray = new int[0];
            return zeroArray;
        } else {
            final int size = array.length;

            final int[] result = new int[size];
            for (int i = 0; i < size; i++)
                result[i] = i;

            boolean sorted;
            do {
                sorted = true;
                int bubble = result[0];
                for (int i = 0; i < size - 1; i++) {
                    if (array[bubble] > array[result[i + 1]]) {
                        result[i] = result[i + 1];
                        result[i + 1] = bubble;
                        sorted = false;
                    } else {
                        bubble = result[i + 1];
                    }
                }
            } while (!sorted);

            return result;

        }
    }// end Indeksering


    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        //Virker men er ineffektiv

        if (a.length < 3) {
            throw new NoSuchElementException("Tabellen har for få elementer");
        } else {

            int[] arrayCopy = a.clone();
            int[] threeMinIndex = {0, 1, 2};//new int[3];

            threeMinIndex[0] = arrayCopy[threeMinIndex[0]];
            threeMinIndex[1] = arrayCopy[threeMinIndex[1]];
            threeMinIndex[2] = arrayCopy[threeMinIndex[2]];

            threeMinIndex = indekssortering(threeMinIndex);

            int minNumber = threeMinIndex[0];
            int secondMinNumber = threeMinIndex[1];
            int thirdMinNumber = threeMinIndex[2];

            for (int i = 3; i < arrayCopy.length; i++) {
                if (arrayCopy[i] < arrayCopy[thirdMinNumber]) {
                    if (arrayCopy[i] < arrayCopy[minNumber]) {
                        thirdMinNumber = secondMinNumber;
                        secondMinNumber = minNumber;
                        minNumber = i;

                    } else if (arrayCopy[i] < arrayCopy[secondMinNumber]) {
                        thirdMinNumber = secondMinNumber;
                        secondMinNumber = i;

                    } else {
                        thirdMinNumber = i;

                    }
                }
            }

            threeMinIndex[2] = thirdMinNumber;
            threeMinIndex[1] = secondMinNumber;
            threeMinIndex[0] = minNumber;

            return threeMinIndex;

        }


    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        return bokstav;
    }

    public static boolean inneholdt(String a, String b) {
        int[] bokstaver = new int[256];
        for (int i = 0; i < bokstaver.length; i++) {
            bokstaver[i] = 0;
        }

        String ordA = a;
        String ordB = b;

        for (int i = 0; i < ordA.length(); i++) {
            bokstaver[bokstavNr(ordA.charAt(i))] += 1;
        }
        for (int i = 0; i < ordB.length(); i++) {
            bokstaver[bokstavNr(ordB.charAt(i))] -= 1;
        }


        for (int i = 0; i< bokstaver.length; i ++) {
            if (bokstaver[i] > 0) {
                return false;
            }
        }
        return true;
    }

    // Oblig1

    //***********************************************************
    //Hjelpemetoder fra kompendiet
    //***********************************************************
    public static int[] randPerm(int n)  // en effektiv versjon
    {
        Random r = new Random();         // en randomgenerator
        int[] a = new int[n];            // en tabell med plass til n tall

        Arrays.setAll(a, i -> i + 1);    // legger inn tallene 1, 2, . , n

        for (int k = n - 1; k > 0; k--)  // løkke som går n - 1 ganger
        {
            int i = r.nextInt(k+1);        // en tilfeldig tall fra 0 til k
            bytt(a,k,i);                   // bytter om
        }

        return a;                        // permutasjonen returneres
    }
    public static void bytt(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int[] sortMinToMax (int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}