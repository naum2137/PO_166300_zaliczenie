package zadanie2;

import java.util.ArrayList;

public class Zadanie2 {

//    public static <E> ArrayList<? super E> dodaj(ArrayList<E> tab1 , ArrayList<E> tab2){
//        for(int i = 0 ; i< tab2.size() ; i++){
//            tab1.add(tab2.get(i));
//        }
//        return tab2;
//    }

    public static <E> ArrayList<? super E> dodaj(ArrayList<E> tab1 , ArrayList<E> tab2){
        for(int i = tab2.size()-1 ; i >= 0  ; i--){
            tab1.add(tab2.get(i));
        }
        return tab1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> kkk = new ArrayList<>();
        kkk.add(12);
        kkk.add(62);
        kkk.add(122);

        ArrayList<Integer> kkk1 = new ArrayList<>();
        kkk1.add(999);
        kkk1.add(888);
        kkk1.add(1112);

        System.out.println(dodaj(kkk,kkk1));

        ArrayList<String> kkk2 = new ArrayList<>();
        kkk2.add("100002");
        kkk2.add("12sf");
        kkk2.add("12");


        ArrayList<String> kkk3 = new ArrayList<>();
        kkk3.add("1sdf2");
        kkk3.add("1245");
        kkk3.add("2222212");

        System.out.println(dodaj(kkk2,kkk3));


    }
}
