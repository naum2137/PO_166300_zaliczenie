package zadanie1;

import java.util.Comparator;
import java.util.Date;

public class CordlessVacuumCleaner extends VacuumCleaner implements Cloneable {
    private final int id;
    private Date dateOfProd = null;

    public CordlessVacuumCleaner(String name, int id) {
        super(name);
        this.id = id;
        this.dateOfProd = new Date();
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID = " + id
                + ", dateOfProd = " + dateOfProd
                + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        CordlessVacuumCleaner kkk = (CordlessVacuumCleaner) obj;
        return id == kkk.id;

    }





}
