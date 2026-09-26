class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        //using StringBuilder so we can update the String
        StringBuilder sb = new StringBuilder();
        // The secondBuilder is to find the key value
        StringBuilder sb2 = new StringBuilder();
        HashMap<String, String> map = new HashMap<>();

        //add the key values pairs to a HashMap for easy retrival later  
        for (List<String> pair : knowledge) {
            String key = pair.get(0);
            String value = pair.get(1);

            map.put(key, value);
        }

        int i = 0;//it is a itorator

        while (i < s.length()) {
            
            if (s.charAt(i) == '(') {//if the element is '('so the key is after it so extract chars after that 
                i++;

                while (s.charAt(i) != ')') {// we only need to find the key after')' are not part of key
                    sb2.append(s.charAt(i));
                    i++;
                }

                if (map.containsKey(sb2.toString())) {//checking if map contains the key if not appand '?'
                    i++;
                    sb.append(map.get(sb2.toString()));

                } else {
                    sb.append('?');
                    i++;
                }

                sb2.setLength(0);//clear for next key
            } else {//add non key - value pair character
                sb.append(s.charAt(i));
                i++;
            }
        }
        return new String(sb);
    }
}