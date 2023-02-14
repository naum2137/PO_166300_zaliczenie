package zadanie1termin2a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Mentor extends Player implements Named, Cloneable,Comparable<Mentor>{
    private final int id;
    private Date dateOfStart = null;
    private ArrayList<Integer> points = null;

    public Mentor(String name, int id, ArrayList<Integer> points) {
        super(name);
        this.id = id;
        this.dateOfStart = new Date();
        this.points = points;
    }

    public int getId() {
        return id;
    }
    public ArrayList<Integer> getPoints() {
        return points;
    }

    public String toString() {
        return "ID = " + id
                + ", dateOfStart = " + dateOfStart
                + ", points = " + points;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Mentor klon = (Mentor) super.clone();
        klon.dateOfStart = (Date) dateOfStart.clone();
        klon.points = (ArrayList<Integer>) points.clone();
        return klon;
    }


    @Override
    public int compareTo(Mentor o) {
        int kkk = this.getName().compareTo(o.getClass().getName());
        if (kkk != 0){
            return kkk;
        }
        return 0;
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
        Object kkk = (Object) obj;
        return this.getName().equals(kkk.getClass().getName());

    }
}
