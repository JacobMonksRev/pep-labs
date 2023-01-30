
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        Integer num = 1;
        for (int i = 1; i < in.length(); i++) {
            if (in.charAt(i) == ' ') {
                num++;
            }
        }
        return num;
    }
}
