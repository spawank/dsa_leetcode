// With Sorting 

// class Solution {
//     public boolean isAnagram(String s, String t) {
//        int n1, n2;
//        n1 = s.length();
//        n2 = t.length();
//        if (n1 != n2) return false;
//        char[] arr1 = s.toCharArray(); 
//        char[] arr2 = t.toCharArray();
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        return Arrays.equals(arr1, arr2);
//     }
// }

// Best approach(with counter)

class Solution {
    public boolean isAnagram(String s, String t) {
        int n1, n2;
        n1 = s.length();
        n2 = t.length();
        if (n1 != n2) return false;
        int[] count = new int[26];
        for(int i=0; i< n1; i++) {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int i=0; i<26; i++) {
            if (count[i] !=0) return false;
        }
        return true;
    }
}