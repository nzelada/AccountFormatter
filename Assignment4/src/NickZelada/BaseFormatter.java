package NickZelada;

/**
 * BaseFormatter implements the interface NumberFormatter and returns each
 * number in their base format.
 *
 * @author Nick Zelada
 * @version 02/21/19 I affirm that this program is entirely my own work and
 * other person's work is involved.
 */
public class BaseFormatter implements NumberFormatter {

    int base; // base number

    public BaseFormatter(int b) {
        base = b;
        if (base > 2 && base < 32) { // see if the base is 2-32
            base = b; // we make b to be base
        }

    }

    public String format(int n) {

        return Integer.toString(n, base); // returns the number in their base
    }

}
