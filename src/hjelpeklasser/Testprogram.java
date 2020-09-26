package hjelpeklasser;

public class Testprogram
{
    public static <T extends Comparable<? super T>> int maks(T[] a)
    {
        return 0;
    }

    public static void main(String... args)
    {
        A[] a = new A[1];
        B[] b = new B[1];
        C[] c = new C[1];

        maks(a);
        maks(b);
        maks(c);
    }
}

class A implements Comparable<A>
{
    public int compareTo(A a) { return 0; }
}

class B extends A {}

class C implements Comparable<Object>
{
    public int compareTo(Object o) { return 0; }
}
