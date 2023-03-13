import java.util.*;
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int stringLen = str.length();
        char answer = 0;
        int count = 0;
        for(int i = 0; i < stringLen; i++){
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
            if(count < map.get(c)) {
                answer = c;
                count = map.get(c);
            }
        }
        return answer;
    }
}
