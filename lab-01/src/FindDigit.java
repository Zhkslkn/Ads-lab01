import org.apache.commons.lang3.StringUtils;
public class FindDigit {
/*
    @ findDigitInString - method to find where is all characters are digits in a string
    @ str - the string
    @ return - returning true or false value, where is all are digits
*/
    public static boolean findDigitInString(String str) {
        if (str.length() == 1) {
            return StringUtils.isNumeric(str);
        }

        String lastIndex = str.substring(str.length() - 1);
        return StringUtils.isNumeric(lastIndex)
                && findDigitInString(str.substring(0, str.length() - 1));
    }
}