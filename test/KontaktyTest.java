/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Collections;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rn
 */
public class KontaktyTest {
    
    @Test
    public void testSort() {
        Kontakty kontakty = new Kontakty();
        Collections.sort(kontakty);
        
        System.out.println(kontakty);
        
        for (Kontakt k : kontakty) {
            System.out.println(k);
        }
    }
}
