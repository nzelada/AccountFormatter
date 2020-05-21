package NickZelada;

/**
 * DefaultFormatter implements NumberFormatter returns the integer without any
 * formatting.
 * @author Nick Zelada
 * @version 02/21/19 I affirm that this program is entirely my own work and
 * other person's work is involved.
 */
public class DefaultFormatter implements NumberFormatter {

    public String format(int n) {
        return String.valueOf(n); // returns the integer of n
    }

}
