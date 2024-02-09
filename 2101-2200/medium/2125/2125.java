class Solution {
    public int numberOfBeams(String[] bank) {

        int[] total = new int[bank.length];

        for (int i = 0; i < bank.length; i++) {
            int count = 0;
            for (char ch: bank[i].toCharArray()) {
                if(ch == '1') {
                    count++;
                }
            }
            total[i] = count;
        }

        int product = 1;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < total.length; i++) {
            if(total[i] != 0) {
                if(count == 0) {
                    product *= total[i];
                    
                }else {
                     product *= total[i];
                     sum += product;
                    product = total[i];
                }
               count++;
            }
        }
        
        return sum;
    }
}
