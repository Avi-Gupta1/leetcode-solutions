class Solution {
    public List<Integer> getPrimeFactors(int n){
        List<Integer> pf = new ArrayList<>();
        while (n%2==0)
        {
            pf.add(2);
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            while (n%i == 0)
            {
                pf.add(i);
                n /= i;
            }
        }
 
        if (n > 2) pf.add(n);
        return pf;
    }
    public int smallestValue(int n) {
        List<Integer> pf = getPrimeFactors(n);
        while(pf.size() != 1) {
            int sum = 0;
            for (int i : pf) {
                sum += i;
            }
            if(sum == n) {
                return n;
            }
            pf = getPrimeFactors(sum);
            n = sum;
        }
        return pf.get(0);
    }
}
