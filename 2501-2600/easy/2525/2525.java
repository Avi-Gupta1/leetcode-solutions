class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long volume = 1*length;
        volume *= width;
        volume *= height;
        boolean isBulky = false;
        boolean isHeavy = false;

        if(volume >= 1000000000 || length >= 10000 || width >= 10000 || height >= 10000) {
            isBulky = true;
        }
        if(mass >= 100) {
            isHeavy = true;
        }
        if(isBulky && isHeavy) {
            return "Both";
        }
        if(!isBulky && !isHeavy) {
            return "Neither";
        }
        if(isBulky && !isHeavy) {
            return "Bulky";
        }
       if(!isBulky && isHeavy) {
           return "Heavy";
        }
        return "Bulky";
    }
}
