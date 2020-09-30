package eksempelklasser;

public enum Måned {
    JAN ("Januar", 1),
    FEB ("Februar", 2),
    MAR ("Mars", 3),
    APR ("April", 4),
    MAI ("Mai", 5),
    JUN ("Juni", 6),
    JUL ("Juli", 7),
    AUG ("August", 8),
    SEP ("September", 9),
    OKT ("Oktober", 10),
    NOV ("November", 11),
    DES ("Desember", 12);


    private final int mndnr;
    private final String fulltnavn;



    Måned(String mndnavn, int mndnr) {
        this.fulltnavn = mndnavn;
        this.mndnr = mndnr;
    }

    public String toString(){
        return fulltnavn;
    }

    public static String toString(int mnd){
        if (mnd < 1 || mnd > 12){
            throw new IllegalArgumentException("Månedsnummer eksisterer ikke.");
        }
        else{
            return values()[mnd - 1].toString();
        }
    }

    public static Måned[] vår(){
        return new Måned[]{APR, MAI};
    }

    public static Måned[] sommer(){
        return new Måned[]{JUN, JUL, AUG};
    }
    public static Måned[] høst(){
        return new Måned[]{SEP, OKT};
    }
    public static Måned[] vinter(){
        return new Måned[]{NOV, DES,JAN, FEB, MAR};
    }


}
