class Solution {
    public boolean checkString(String s) {
    boolean appeardA = false;
    boolean appeardB = false;
     for (char ch: s.toCharArray()) {
         if(ch == 'a') {
             if(appeardB) {
                 return false;
             }
             appeardA = true;
         }else {
             appeardB = true;
         }
     }
     return true;
    }
}
