// https://leetcode.com/problems/plus-one/

class PlusOne {   
    public int[] plusOne(int[] digits) {
        int i,v, n = digits.length;
        int intlength, rem = 0;
        i = n-1;
        while(i > -1) {
           v = digits[i]+ rem;
           if(i == n-1) v++;
           intlength =  (int)(Math.log10(v)+1);
           if (intlength == 1) {
               digits[i] = v;
               rem = 0;
               break;
           } else {
               digits[i] = v % 10;
               rem = 1;
               i--;
           }
        }
        
        //Adding rem as first digit of array
        if (rem == 1) {
            int arr[] = new int[n + 1];
            arr[0] = 1;
            for(int j=0 ; j < n ;j++){
                arr[j+1] = digits[j];
            }
            return arr;
        }
        return digits;
    }
}