
import eksempelklasser.Komparator;
import hjelpeklasser.Tabell;

public class Program {
    public static void main(String[]args) {
        Integer[] a = Tabell.randPermInteger(5000);
        long tid = System.currentTimeMillis();
        Tabell.innsettingssortering(a, Komparator.naturligOrden());
        System.out.println(System.currentTimeMillis() - tid);


    }
}
