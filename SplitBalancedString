class Solution {
    public int balancedStringSplit(String s) {
      int lcount=0, rcount=0, total=0;
      for(int i =0; i < s.length(); i++) {
         if (s.charAt(i) == 'L') lcount++;
         if (s.charAt(i) == 'R') rcount++;
         if (lcount == rcount) {
             total++;
             lcount = 0;
             rcount = 0;
         }
      }
      return total;
    }
}
