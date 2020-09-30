package eksempelklasser;


@FunctionalInterface                // legges i mappen eksempelklasser
public interface Komparator<T>      // et funksjonsgrensesnitt
{
    int compare(T x, T y);            // en abstrakt metode

    static <T extends Comparable<? super T>> Komparator <T> naturligOrden()
    {
        return ((x, y) -> x.compareTo(y));
    }

    static <T extends Comparable<? super T>> Komparator <T> omvendtOrden()
    {
        return (x, y) -> y.compareTo(x);
    }

    static <T, R extends Comparable<? super R>>
    Komparator<T> orden(Funksjon<? super T, ? extends R> velger)
    {
        return (x, y) -> velger.anvend(x).compareTo(velger.anvend(y));
    }

    static <T, R> Komparator<T> orden
            (Funksjon<? super T, ? extends R> velger, Komparator<? super R> c)
    {
        return (x, y) -> c.compare(velger.anvend(x), velger.anvend(y));
    }
}