class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        StringBuilder sb = new StringBuilder(s);
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        StringBuilder sb2 = new StringBuilder(t);
        Map<Character, Integer> map2 = new HashMap<>();

        for(int i=0;i< sb2.length();i++){
            char ch = sb2.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        for (Character key : map.keySet()) {
            if (!map2.containsKey(key) || !map.get(key).equals(map2.get(key))) {
                return false;
            }
        }
        return map.size() == map2.size();
    }
}