class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var numbersFrequencyMap = new HashMap<Integer, Integer>();
        int[] result = new int[k];
        for (int i = 0; i < nums.length; i++) {
            numbersFrequencyMap.put(nums[i], numbersFrequencyMap.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(
            (a, b) -> numbersFrequencyMap.get(b) - numbersFrequencyMap.get(a));
        heap.addAll(numbersFrequencyMap.keySet());
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }
        return result;
    }
}
