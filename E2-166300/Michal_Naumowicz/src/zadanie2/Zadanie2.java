package zadanie2;

public class Zadanie2 {
    public static <E extends Comparable<E>> int maximum(Integer a1, Integer a2, Integer a3) {
        int max = 0;

        if (a1 > a2){
            if (a1 > a3){
                max = a1;
            }
        }else if (a2 > a3){
            max = a2;

        } else {
            max = a3;

        }
            return max;
    }
}
