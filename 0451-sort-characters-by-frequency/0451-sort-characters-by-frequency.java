class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        for(char c : s.toCharArray())map.put(c, map.getOrDefault(c, 0)+1);
        pq.addAll(map.entrySet());

        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            
            Map.Entry<Character, Integer> e = pq.poll();
            sb.append(String.valueOf(e.getKey()).repeat(e.getValue()));

        }

        return sb.toString();
    }
}