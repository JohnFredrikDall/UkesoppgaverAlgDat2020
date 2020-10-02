package hjelpeklasser;

import eksempelklasser.Komparator;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;


public class Tabell {

    private Tabell(){};

    public static void bytt(Object[] a, int i, int j)
    {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void bytt(int[] a, int i, int j)
    {
        int temp = a[i]; a[i] = a[j]; a[j] = temp;
    }

    public static void bytt(char [] c, int i, int j){
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    public static void vhKontroll(int tablengde, int v, int h)
    {
        if (v < 0)
            throw new ArrayIndexOutOfBoundsException("v(" + v + ") < 0");

        if (h >= tablengde)
            throw new ArrayIndexOutOfBoundsException
                    ("h(" + h + ") >= tablengde(" + tablengde + ")");

        if (v > h + 1)
            throw new IllegalArgumentException
                    ("v = " + v + ", h = " + h);
    }

    public static void fratilKontroll(int tablengde, int fra, int til)
    {
        if (fra < 0){
            throw new ArrayIndexOutOfBoundsException("Fra(" + fra + ") er negativ!");
        }
        if(til > tablengde)
        {
            throw new ArrayIndexOutOfBoundsException("Til(" + til + ") > tablengde(" + tablengde + ")");
        }
        if (fra > til)
        {
            throw new IllegalArgumentException("fra(" + fra + ") > til(" + til + ") - illegalt intervall!");
        }
        if (fra == til)
        {
            throw new NoSuchElementException("fra(" + fra + ") = til(" + til + ") - tomt tabellintervall!");
        }
    }

    public static void skriv(Object[] a, int fra, int til){
        fratilKontroll(a.length, fra, til);
        if(til - fra > 0)
        {
            System.out.print(a[fra].toString());
        }
        for(int i = fra + 1; i < til; i++)
        {
            System.out.print(" " + a[i].toString());
        }
    }

    public static void skriv(Object[] a){
        skriv(a, 0, a.length);
    }

    public static void skrivln(Object[] a, int fra, int til)
    {
        fratilKontroll(a.length, fra, til);
        skriv(a, fra, til);
        System.out.println();
    }

    public static void skriv(int [] a, int fra, int til){
        fratilKontroll(a.length, fra, til);
        if(til - fra > 0)
        {
            System.out.print(a[fra]);
        }
        for(int i = fra +1; i < til; i++){
            System.out.print(" " + a[i]);
        }
    }

    public static void skriv(int [] a){
        skriv(a, 0, a.length);
    }

    public static void skrivln(int [] a, int fra, int til){
        fratilKontroll(a.length, fra, til);
        skriv(a,fra,til);
        System.out.println();
    }

    public static void skrivln(int [] a){
        skrivln(a, 0, a.length);
    }

    public static void skriv(char [] a, int fra, int til){
        if(til - fra > 0)
        {
            System.out.print(a[fra]);
        }
        for(int i = fra +1; i < til; i++){
            System.out.print(" " + a[i]);
        }
    }

    public static void skriv(char [] c){
        skriv(c, 0, c.length);
    }

    public static void skrivln(char [] c, int fra, int til){
        fratilKontroll(c.length, fra, til);
        for(int i = fra; i < til; i++){
            System.out.print(c[i] + " ");
            System.out.println();
        }
    }

    public static void skrivln(char [] c){
        skrivln(c, 0, c.length);
    }


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

    public static Integer[] randPermInteger(int n)
    {
        Integer[] a = new Integer[n];               // en Integer-tabell
        Arrays.setAll(a, i -> i + 1);               // tallene fra 1 til n

        Random r = new Random();   // hentes fra  java.util

        for (int k = n - 1; k > 0; k--)
        {
            int i = r.nextInt(k+1);  // tilfeldig tall fra [0,k]
            bytt(a,k,i);             // bytter om
        }
        return a;  // tabellen med permutasjonen returneres
    }

    public static void randPerm(int[] a)  // stokker om a
    {
        Random r = new Random();     // en randomgenerator

        for (int k = a.length - 1; k > 0; k--)
        {
            int i = r.nextInt(k + 1);  // tilfeldig tall fra [0,k]
            bytt(a,k,i);
        }
    }

    public static <T extends Comparable<? super T>> int maks(T[]a)
    {
        int m = 0;              //indeks til største verdi
        T maksverdi = a[0];     //største verdi

        for(int i = 1; i < a.length; i++)
        {
            if (a[i].compareTo(maksverdi) > 0)
            {
                maksverdi = a[i];   //største verdi oppdateres
                m = i;              //indeks til største verdi oppdateres
            }
        }
        return m;           //returnerer indeks til største verdi
    }

    public static int maks(double[] a)     // legges i class Tabell
    {
        int m = 0;                           // indeks til største verdi
        double maksverdi = a[0];             // største verdi

        for (int i = 1; i < a.length; i++) if (a[i] > maksverdi)
        {
            maksverdi = a[i];     // største verdi oppdateres
            m = i;                // indeks til største verdi oppdaters
        }
        return m;     // returnerer posisjonen til største verdi
    }

    public static int maks(char[] a)     // legges i class Tabell
    {
        int m = 0;                           // indeks til største verdi
        char maksverdi = a[0];             // største verdi

        for (int i = 1; i < a.length; i++) if (a[i] > maksverdi)
        {
            maksverdi = a[i];     // største verdi oppdateres
            m = i;                // indeks til største verdi oppdaters
        }
        return m;     // returnerer posisjonen til største verdi
    }


    public static int maks(int[] a, int fra, int til) {
        fratilKontroll(a.length, fra, til);

        int m = fra;              // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++)
        {
            if (a[i] > maksverdi)
            {
                m = i;                // indeks til største verdi oppdateres
                maksverdi = a[m];     // største verdi oppdateres
            }
        }

        return m;  // posisjonen til største verdi i a[fra:til>
    }

    public static int maks(int[] a)  // bruker hele tabellen
    {
        return maks(a,0,a.length);     // kaller metoden over
    }

    public static int[] nestMaks(int[] a)  // legges i class Tabell
    {
        int n = a.length;   // tabellens lengde

        if (n < 2) throw   // må ha minst to verdier!
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = maks(a);  // m er posisjonen til tabellens største verdi

        int nm;           // nm skal inneholde posisjonen til nest største verdi

        if (m == 0)                            // den største ligger først
        {
            nm = maks(a, 1, n);                  // leter i a[1:n>
        }
        else if (m == n - 1)                   // den største ligger bakerst
        {
            nm = maks(a, 0, n - 1);              // leter i a[0:n-1>
        }
        else
        {
            int mv = maks(a, 0, m);              // leter i a[0:m>
            int mh = maks(a, m + 1, n);          // leter i a[m+1:n>
            nm = a[mh] > a[mv] ? mh : mv;        // hvem er størst?
        }

        return new int[] {m,nm};      // m i posisjon 0 , nm i posisjon 1

    } // nestMaks

    public static int min(int []a, int fra, int til){
        fratilKontroll(a.length, fra, til);
        int m = fra;
        int minverdi = a[fra];

        for(int i = fra + 1; i < til; i++)
        {
            if(a[i] < minverdi)
            {
                m = i;
                minverdi = a[m];
            }
        }
        return m;
    }

    public static void snu(int[]a, int v, int h){
        vhKontroll(a.length, v, h);

        while(v < h)
        {
            bytt(a, v++, h--);
        }
    }

    public static void snu(int[]a){
        int v = 0;
        int h = a.length -1;
        while(v < h)
        {
            bytt(a, v++, h--);
        }
    }

    public static int min(int [] a){
        return min(a, 0, a.length);
    }

    public static <T extends Comparable<? super T>> void innsettingssortering(T[] a)
    {
        for (int i = 1; i < a.length; i++)  // starter med i = 1
        {
            T verdi = a[i];        // verdi er et tabellelemnet
            int  j = i - 1;        // j er en indeks
            // sammenligner og forskyver:
            for (; j >= 0 && verdi.compareTo(a[j]) < 0 ; j--) a[j+1] = a[j];

            a[j + 1] = verdi;      // j + 1 er rett sortert plass
        }
    }


    public static <T> void innsettingssortering(T[] a, Komparator<? super T> c)
    {
        for (int i = 1; i < a.length; i++)  // starter med i = 1
        {
            T verdi = a[i];        // verdi er et tabellelemnet
            int  j = i - 1;        // j er en indeks

            // sammenligner og forskyver:
            for (; j >= 0 && c.compare(verdi,a[j]) < 0 ; j--) a[j+1] = a[j];

            a[j + 1] = verdi;      // j + 1 er rett sortert plass
        }
    }
    public static int binarySearch(int searchValue, int [] values, int left, int right) {
        int middle = (left + right) / 2;

        if (right - left == 0) {
            if (searchValue == values[middle]) {
                return middle;
            }
            else {
                return -middle;
            }
        }

        if (values[middle] <= searchValue) {
            if (searchValue == values[middle]) {
                return middle;
            }
            return binarySearch(searchValue, values, middle + 1, right);
        }
        else {
            return binarySearch(searchValue, values, left, middle - 1);
        }
    }

    public static void recursivePermutation(int [] values, int k)
    {
        if (k == values.length -1)
        {
            System.out.println(Arrays.toString(values));
        }

        for(int i = k; i < values.length; i++)
        {
            bytt(values, i, k);
            recursivePermutation(values, k+1);
            bytt(values, k, i);
        }

    }
}
