

public class Czasopismo extends Publikacja {

    public  Czasopismo(String tytul, double cena, int rok, int miesiac, int dzien, int numer){
        super(tytul ,cena ,rok ,miesiac ,dzien );
        this.numer = numer;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    @Override
    public String toString() {
        String temp = " ";
        temp += super.toString();
        temp += " [Czasopismo], ";
        temp += "["+numer+"], ";
        return temp;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Czasopismo kkk = (Czasopismo) obj;
        return this.numer == kkk.numer;

    }

    private int numer;

}
