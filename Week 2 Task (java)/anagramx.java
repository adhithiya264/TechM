package anagram;

import java.util.ArrayList;
import java.util.List;

public class anagramx {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        
        // Edge case: if p is longer than s, return empty list
        if (s.length() < p.length()) {
            return result;
        }

        // Create frequency arrays for p and the current window in s
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        
        // Initialize frequency arrays for p and the first window of s
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        // If the initial window is an anagram of p, add index 0
        if (compareArrays(pCount, sCount)) {
            result.add(0);
        }

        // Sliding window: start from index p.length() to the end of s
        for (int i = p.length(); i < s.length(); i++) {
            // Add the new character to the window
            sCount[s.charAt(i) - 'a']++;
            // Remove the old character from the window
            sCount[s.charAt(i - p.length()) - 'a']--;

            // If current window is an anagram of p, add the starting index
            if (compareArrays(pCount, sCount)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }

    // Helper method to compare two frequency arrays
    private boolean compareArrays(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        AnagramFinder finder = new AnagramFinder();
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> result = finder.findAnagrams(s, p);
        
        // Output the result
        System.out.println(result);  // Output: [0, 6]
    }
}
