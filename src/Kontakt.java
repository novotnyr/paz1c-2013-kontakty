public class Kontakt implements Comparable<Kontakt> {
    private Long id;
    
    private String nick;

    public Kontakt(Long id, String nick) {
        this.id = id;
        this.nick = nick;
    }
    
    public Long getId() {
        return id;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public int compareTo(Kontakt kontakt) {
        return this.nick.compareTo(kontakt.getNick());
    }

    @Override
    public String toString() {
        return "Kontakt{" + "id=" + id + ", nick=" + nick + '}';
    }
    
    
}
