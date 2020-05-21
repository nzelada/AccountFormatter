package NickZelada;

/**
 * AccountingFormatter implements NumberFormatter, which returns each number
 * without any spaces and in parentheses for negative numbers
 *
 * @author Nick Zelada
 * @version 02/21/19 I affirm that this program is entirely my own work and
 * other person's work is involved.
 */
public class AccountingFormatter implements NumberFormatter {

    public String format(int n) {

        return String.format("%(d", n); /* return a number in parentheses if 
         number is a negative number */

    }

}
