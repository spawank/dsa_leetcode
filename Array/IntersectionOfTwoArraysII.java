import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int l1, l2, k;
        int[] result;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
          if (hm.containsKey(nums1[i])) { 
             k = hm.get(nums1[i]); 
             hm.put(nums1[i], k+1);  }
            else {
             hm.put(nums1[i], 1); 
            }
        }
        
        for( int i=0; i < nums2.length; i++) {
            if (hm.containsKey(nums2[i])) {
                k = hm.get(nums2[i]);
                if (k > 0) {
                    list.add(nums2[i]);
                    k = k-1;
                    hm.put(nums2[i], k);
                }
            }
        }
        
        result = new int[list.size()];
        for (int i=0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
}
}