
import java.util.AbstractList;
import java.util.List;

/**
 * Modifikovatelny zoznam kontaktov fixnej dlzky.
 * 
 * @see dokumentacia k java.util.AbstractList
 */
public class Kontakty extends AbstractList<Kontakt> {
    private Kontakt[] kontakty = new Kontakt[2];

    public Kontakty() {
        kontakty[0] = new Kontakt(1L, "Bill Gates");
        kontakty[1] = new Kontakt(2L, "Anna Karenina");
    } 
    
    @Override
    public Kontakt get(int index) {
        return kontakty[index];
    }

    @Override
    public int size() {
        return kontakty.length;
    }

    @Override
    public Kontakt set(int index, Kontakt kontakt) {
        Kontakt predoslyKontakt = kontakty[index];
        kontakty[index] = kontakt;

        return predoslyKontakt;
    }
    
    
}
