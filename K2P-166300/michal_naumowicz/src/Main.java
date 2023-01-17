public class Main {
    public static void main(String[] args) {


        Publikacja nowa = new Publikacja("rewelacja publkikacja", 100.0);
        System.out.println(nowa.toString());
        System.out.println(Publikacja.getIle());
        Publikacja stara = new Publikacja("Stara publikacja", 20, 1970, 12, 12);
        Publikacja stara1 = new Publikacja("Stara publikacja", 20, 1970, 12, 12);
        System.out.println(stara.toString());
        System.out.println(Publikacja.getIle());



        System.out.println(stara==nowa);

        System.out.println(stara.equals(nowa));
        System.out.println(stara.equals(stara1));



    }
}