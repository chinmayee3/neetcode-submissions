class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> mappings = new HashMap<>();
        mappings.put(')','(');
        mappings.put('}','{');
        mappings.put(']','[');

        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(mappings.containsKey(c)){
                char top= stack.isEmpty() ? '#' : stack.pop();
                if(top!=mappings.get(c)){
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
        
    }
}
