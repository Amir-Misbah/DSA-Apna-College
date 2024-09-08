import java.util.HashMap;

public class Anagram {
    public static boolean isAnagrams(String s, String t) {
        if (s.length() != t.length()) {
            return false; // Strings of different lengths can't be anagrams
        }

        HashMap<Character, Integer> hm = new HashMap<>();
        
        // Count frequency of each character in s
        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        
        // Decrease frequency based on characters in t
        for (char ch : t.toCharArray()) {
            if (!hm.containsKey(ch)) {
                return false; // If t has a character not in s
            }
            int count = hm.get(ch);
            if (count == 1) {
                hm.remove(ch); // Remove the key if count reaches 0
            } else {
                hm.put(ch, count - 1); // Decrease the count
            }
        }
        
        // Check if the map is empty
        return hm.isEmpty();
    }

    public static void main(String[] args) {
        String s = "aabbcc";
        String t = "aabbccc"; // Test case with an extra 'c'
        System.out.println(isAnagrams(s, t)); // Expected: false
    }
}
