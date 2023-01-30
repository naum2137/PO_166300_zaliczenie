import zadanie1.*;

public class Main {
    public static void main(String[] args) {
        //4c2399nF
        System.out.println("Hello world!");

        VacuumCleaner p = new CordlessVacuumCleaner("Elektorlux", 1729);
        System.out.println(p.getName());
        CordlessVacuumCleaner s = (CordlessVacuumCleaner) p;
        System.out.println(s.getName());



    }
}