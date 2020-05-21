package NickZelada;

/**
 * DecimalSeparatorFormatter implements NumberFormatter makes the numbers to
 * have spaces and commas.
 *
 * @author Nick Zelada
 * @version 02/21/19 I affirm that this program is entirely my own work and
 * other person's work is involved.
 */
public class DecimalSeparatorFormatter implements NumberFormatter {

    public String format(int n) {

        return String.format("%,d", n); /*returns the number with spaces 
         and commas*/

    }

}
