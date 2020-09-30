package eksempelklasser;

public enum Studium {
    Data ("Ingeniørfag - data"),         // enumkonstanten Data
    IT ("Informasjonsteknologi"),        // enumkonstanten IT
    Anvendt ("Anvendt datateknologi"),   // enumkonstanten Anvendt
    Elektro ("Ingeniørfag - elektronikk og informasjonsteknologi"), //enumkonstant Elektro og informasjonsteknologi
    Enkeltemne ("Enkeltemnestudent");    // enumkonstanten Enkeltemne


    private final String fulltnavn;      // instansvariabel
    private Studium(String fulltnavn) { this.fulltnavn = fulltnavn; }

    public String toString() { return fulltnavn; }
}
