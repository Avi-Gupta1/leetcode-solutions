class Solution {
    public HashSet primeFactors(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n%2 == 0) {
            n /= 2;
            set.add(2);
        }
       
        for (int i = 3; i <= Math.sqrt(n); i++) {
            while (n%i == 0){
                n /= i;
                set.add(i);
            }
          
        }

        if(n > 2) {
            set.add(n);
        }
        return set;
    }

    public int distinctPrimeFactors(int[] nums) {
       
        HashSet<Integer> set = new HashSet<>();    
        for (int i: nums) {
            set.addAll(primeFactors(i));
        }
        return set.size();
    }
}
