package zadanie1termin2a;

public abstract class Player {
    private String name;

    public Player(String name) { this.name = name; }
    public final String getName() { return name; }

    public abstract int getId();
}

