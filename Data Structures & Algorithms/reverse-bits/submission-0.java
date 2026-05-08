class Solution {
    public int reverseBits(int n) {
        int reversedNumber = 0;
        for(int i=31; i >=0; i--){
           reversedNumber <<= 1;
           reversedNumber |= (n & 1);
           n >>>= 1;
        }
        return reversedNumber;
    }
}
