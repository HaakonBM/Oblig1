package Oblig1;

////// Løsningsforslag Oblig 1 - 2019 ////////////////////////

import com.sun.xml.internal.bind.v2.TODO;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;


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

            int antallUnikeTall = array.length;
            int counter = 0;

            for (int i = 0; i < array.length; i++) {

                for (int j = array.length - 1; j > i; j--) {

                    if (array[i] == array[j]) {
                        counter++;
                    }
                }
                antallUnikeTall = antallUnikeTall - counter;
                counter = 0;
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
        if (a.length != 0) {
            char[] arr = a;
            if (n > 0) {
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
            else if (n < 0) {
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
    public static int[] indekssortering(int[] array) {
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


    }// end Indeksering


    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        /*
        TODO
        Startverdiene skal hentes fra oppgave 8
        Bruker midlertidige verdier intill oppg. 8 er på plass
         */
        if (a.length < 3) {
            throw new java.util.NoSuchElementException("Tabellen har for få elementer");
        }
        

        int[] indeksTreMinste =  new int[3];

        int minsteTall = 0;
        int nestMinsteTall = 0;
        int tredjeMinsteTall = 0;

        int minsteIndeks = a[0];
        int nestMinsteIndeks = a[0];
        int tredjeMinsteIndeks = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < tredjeMinsteTall) {
                if (a[i] < minsteTall) {
                    tredjeMinsteIndeks = nestMinsteIndeks;
                    nestMinsteIndeks = minsteIndeks;
                    minsteIndeks = i;

                    tredjeMinsteTall = nestMinsteTall;
                    nestMinsteTall = minsteTall;
                    minsteTall = a[i];
                } else if (a[i] < nestMinsteTall) {
                    tredjeMinsteIndeks = nestMinsteIndeks;
                    nestMinsteIndeks = i;

                    tredjeMinsteTall = nestMinsteTall;
                    nestMinsteTall = a[i];
                } else {
                    tredjeMinsteIndeks = i;

                    tredjeMinsteTall = a[i];
                }

            }
        }

        indeksTreMinste[0] = minsteIndeks;
        indeksTreMinste[1] = nestMinsteIndeks;
        indeksTreMinste[2] = tredjeMinsteIndeks;

        return indeksTreMinste;
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
}