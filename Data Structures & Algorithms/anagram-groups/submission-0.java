class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var anagramsGroup = new ArrayList<List<String>>();
        var anagramsGroupMap = new HashMap<String, List<String>>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            List<String> list = anagramsGroupMap.getOrDefault(sortedString, new ArrayList<>());
            list.add(strs[i]);
            anagramsGroupMap.put(sortedString, list);
        }
        for (List<String> group : anagramsGroupMap.values()) {
            anagramsGroup.add(group);
        }
        return anagramsGroup;
    }
}
