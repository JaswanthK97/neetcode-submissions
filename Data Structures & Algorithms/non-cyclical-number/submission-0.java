class Solution {
    public boolean isHappy(int n) {
        var visited = new HashSet<Integer>();
        while (!visited.contains(n)) {
            visited.add(n);
            int sum = 0;
            int temp = n;
            while (temp > 0) {
                int lastDigit = temp % 10;
                sum += lastDigit * lastDigit;
                temp = temp / 10;
            }
            if (sum == 1) {
                return true;
            }
            n = sum;
        }
        return false;
    }
}
