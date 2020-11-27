// https://leetcode.com/problems/valid-parentheses/

class ValidParentheses {
    public boolean isValid(String s) {
       char[] ch = s.toCharArray();
       boolean b = true;
       if(ch.length == 0) return false;
       Stack<Character> st = new Stack<Character>();
       for(int i = 0; i < ch.length; i++){
           if(ch[i] == '(' || ch[i] == '{' || ch[i] == '['){
               st.push(ch[i]);
           } else {
               if (! st.empty()) {
                   char c = st.pop();
                   char k;
                   if(ch[i] == ')') {
                      k = '(';  } 
                     else if (ch[i] == '}') {
                       k = '{';
                      } else {
                       k = '[';
                      }
                   if(k != c) {
                     b = false;
                   }
               } else {
                   return false;
               }
           }
       }
       if (st.empty()) {
           return b;
       } else { return false;}
    }
}