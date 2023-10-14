class Solution {
    public int takeCharacters(String s, int k) {
       int[] vault = new int[3];

       for  (int i = 0; i < s.length(); i++ ) {
           char ch = s.charAt(i);
           vault[ch-'a']++;
       }

        if(vault[0] < k || vault[1] < k || vault[2] < k) { // checking if this suffice
            return -1;
        }

        int i = s.length()-1; // keeping i at end
        int j = s.length()-1; // keeping j at end
        int min = s.length(); // max number of steps can nevenr exceed size of string
        //valut already contains the sum of total
        while( i >= 0 ) { 
            char ch = s.charAt(i);
            vault[ch-'a']--; // removed the lsat element now vault will have sum before it.
            while( j >= i && (vault[0] < k || vault[1] < k || vault[2] < k)) { // using j to check right side sum of the vault
                ch = s.charAt(j);
                vault[ch-'a']++;
                j--;
            }
            min = Math.min(min,i + s.length() - 1 - j);
            i--;
        }

        return min;
    }
}
