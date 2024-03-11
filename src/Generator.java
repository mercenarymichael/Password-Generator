public class Generator {
    private final static String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private final static String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final static String SPECIAL_CHARS = "~`!@#$%^&*()-_+={}[]|\\;:\"<>,./?";
    private final static String NUMERIC_CHARS = "0123456789";
    private final static int LOWER_LENGTH = LOWER_CASE.length();
    private final static int UPPER_LENGTH = UPPER_CASE.length();
    private final static int SPECIAL_LENGTH = SPECIAL_CHARS.length();
    private final static int NUMERIC_LENGTH = NUMERIC_CHARS.length();
    private final static int NUMBER_OF_STRINGS = 4;

    public Generator(int length) {
        generatePassword(length);
    }

    private static String generatePassword(int length) {
        int charSelector = 0;

        /*
        boolean oneLowerCase = false;
        boolean oneUpperCase = false;
        boolean oneNumeric = false;
        boolean oneSpecial = false;
        */

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < length; i++) {
            charSelector = (int)(Math.random() * NUMBER_OF_STRINGS) + 1;

            switch(charSelector) {
                case 1:
                    sb.append(LOWER_CASE.charAt(randomNumber(LOWER_LENGTH))); break;
                case 2:
                    sb.append(UPPER_CASE.charAt(randomNumber(UPPER_LENGTH))); break;
                case 3:
                    sb.append(SPECIAL_CHARS.charAt(randomNumber(SPECIAL_LENGTH))); break;
                case 4:
                    sb.append(NUMERIC_CHARS.charAt(randomNumber(NUMERIC_LENGTH))); break;
                default:
                    break;
            }
        }
        return sb.toString();
    }

    private static int randomNumber(int range) {
        return (int)(Math.random() * range);
    }
}
