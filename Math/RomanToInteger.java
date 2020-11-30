// https://leetcode.com/problems/roman-to-integer/

class RomanToInteger {
    // HashMap can be used here
    int getValue(char key) 
    { 
        if (key == 'I') 
            return 1; 
        if (key == 'V') 
            return 5; 
        if (key == 'X') 
            return 10; 
        if (key == 'L') 
            return 50; 
        if (key == 'C') 
            return 100; 
        if (key == 'D') 
            return 500; 
        if (key == 'M') 
            return 1000; 
        return -1; 
    } 
    public int romanToInt(String s) {
        int res = 0; 
  
        for (int i = 0; i < s.length(); i++) { 
            // Getting value of symbol s[i] 
            int s1 = getValue(s.charAt(i)); 
  
            // Getting value of symbol s[i+1] 
            if (i + 1 < s.length()) { 
                int s2 = getValue(s.charAt(i + 1)); 
  
                // Comparing both values 
                if (s1 >= s2) { 
                    // Value of current symbol 
                    // is greater or equalto 
                    // the next symbol 
                    res = res + s1; 
                } 
                else { 
                    // Value of current symbol is 
                    // less than the next symbol 
                    res = res + s2 - s1; 
                    i++; 
                } 
            } 
            else { 
                res = res + s1; 
                i++; 
            } 
        } 
  
        return res;
    }
}