package termin3zad1;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;
import java.util.Vector;


public class Java extends ProgrammingLanguage implements Cloneable , Comparable<Java> , Comparator<Java> {
    private static LocalDate dateOfStart = null;
    private Date dateTheLatestRelease = null;
    private Vector<String> properties = null;

    {
        dateOfStart = LocalDate.of(1995, 5, 23);
    }

    public Java(boolean isObjectOriented, Vector<String> prop) {
        super(isObjectOriented);
        this.properties = prop;
        this.dateTheLatestRelease = new Date();
    }

    public Vector<String> getProperties() {
        return properties;
    }

    public String toString() {
        return "Language: " + getClass().getSimpleName()
                + ", dateOfStart = " + dateOfStart
                + ", dateTheLatestRelease = " + dateTheLatestRelease
                + ", properties = " + properties;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Java klon = (Java) super.clone();
        klon.dateTheLatestRelease = (Date) dateTheLatestRelease;
        klon.properties = (Vector<String>) properties;
        return klon;
    }


    @Override
    public int compareTo(Java o) {
        return this.dateTheLatestRelease.compareTo(o.dateTheLatestRelease);
    }

    @Override
    public int compare(Java o1, Java o2) {
        return o2.dateTheLatestRelease.compareTo(o1.dateTheLatestRelease);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (this.getClass() != obj.getClass()){
            return false;
        }
        Java kkk = (Java) obj;

//        return this.dateTheLatestRelease.equals(kkk.dateTheLatestRelease);

//         nie wiem którego użyć żeby był poprawny equals i był zachowany traktat

        return this.dateTheLatestRelease.equals(kkk.dateTheLatestRelease)
                && this.properties.equals(kkk.properties)
                && this.getIsObjectOriented() == kkk.getIsObjectOriented();

    }

}
