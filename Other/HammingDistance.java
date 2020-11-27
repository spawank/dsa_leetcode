// https://leetcode.com/problems/hamming-distance/

class HammingDistance {
    public int hammingDistance(int x, int y) {
       int z, distance=0;
       z = x ^ y;
       while (z > 0) {
           distance += z & 1;
           z = z >>> 1;
       }
        return distance;
    }
}