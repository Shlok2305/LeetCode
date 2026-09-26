class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        char[] sa = s.toCharArray();
        HashMap<String, String> map = new HashMap<>();

        for (List<String> pair : knowledge) {
            String key = pair.get(0);
            String value = pair.get(1);

            map.put(key, value);
        }
        int i = 0;
        while (i < sa.length) {
            if (sa[i] == '(') {
                i++;
                while (sa[i] != ')') {
                    sb2.append(sa[i]);
                    i++;
                }
                if (map.containsKey(sb2.toString())) {
                    i++;
                    sb.append(map.get(sb2.toString()));

                } else {
                    sb.append('?');
                    i++;
                }
            sb2.setLength(0); 
            } else {
                sb.append(sa[i]);
                i++;
            }
        }
        return new String(sb);
    }
}