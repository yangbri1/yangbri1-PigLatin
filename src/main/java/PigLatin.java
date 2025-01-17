
public class PigLatin {
    /**
     * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     * Take in a word and return the pig latin form. You will need to use the substring method of String to break
     * up the string.
     * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param in A string.
     * @return the pig latin form of in.
     */
    public String returnPigLatin(String in){
        // char[] strToCharAry = in.toCharArray();
        // char[] charAry = java.util.Arrays.copyOfRange(strToCharAry, 1, strToCharAry.length);

        String emptyStr = "";

        /* this converting to from String -> char[] & indexing through char[] array works as well */
        // for(int i = 1; i < strToCharAry.length; ++i){
        //     emptyStr += strToCharAry[i];
        // }

        // loop through String directly
        for(int i = 1; i < in.length(); ++i){
            // start appending at index 1 ...
            emptyStr += in.charAt(i);
        }

        // use unary operator '+=' to concatenate the pig latin after String manipulation above
        emptyStr += in.charAt(0) + "ay";
        
        // return completed pig latin phrase
        return emptyStr;
    }
}
