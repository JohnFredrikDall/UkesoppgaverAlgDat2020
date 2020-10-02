public class Testprogram
{
    public static void f(A a) { System.out.println("A"); }   // 1
    public static void f(B b) { System.out.println("B"); }   // 2
    public static void f(C c) { System.out.println("C"); }   // 3

    public static void main(String... args)
    {
        f(new C());
    }
}

class A {}                          // A er en klasse
interface B {}                      // B et grensesnitt
class C extends A implements B {}   // C er subtype til både A og B