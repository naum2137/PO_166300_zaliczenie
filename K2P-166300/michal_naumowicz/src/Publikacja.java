//package Michal;

import java.time.LocalDate;

public class Publikacja {

    public Publikacja(String tytul, double cena, int rok, int miesiac, int dzien){
        this.tytul = tytul;
        this.cena = cena;
        this.dataWydania = LocalDate.of(rok,miesiac,dzien);
        ile++;
    }
    public Publikacja(String tytul, double cena){
        this.tytul = tytul;
        this.cena = cena;
        this.dataWydania = LocalDate.now();
        ile++;
    }

    public String getTytul() {
        return tytul;
    }

    public double getCena() {
        return cena;
    }

    public static int getIle() {
        return ile;
    }

    public LocalDate getDataWydania() {
        return dataWydania;
    }


    public void setDataWydania(int rok,int misiac, int dzien) {
        this.dataWydania = LocalDate.of(rok,misiac,dzien);
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        temp.append("Publikacja ");
        temp.append("["+dataWydania.getYear()+"-");
        temp.append(dataWydania.getMonth()+"-");
        temp.append(dataWydania.getDayOfMonth()+"], ");
        temp.append("["+cena+"], ");
        temp.append("["+ile+"], ");
        if (tytul != "Publikacja Nieznana"){
            temp.append("["+tytul+"], ");
        }
        return temp.toString();
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
        Publikacja kkk = (Publikacja) obj;
        return this.equals(kkk.tytul) && this.cena == kkk.cena && this.dataWydania == kkk.dataWydania;

    }


    public void zwienkrzCene(double procent){
        this.cena = this.getCena() * (procent/100);
    }

    private String tytul;
    private double cena;
    private LocalDate dataWydania;
    private static int ile;

}
