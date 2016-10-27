public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<Integer>();
        if(s==null || s.length()==0 || s.length()<p.length()) return res;
        int len = p.length();

        for(int i=0;i<=s.length()-len;i++){
            String word = s.substring(i,i+len);
            Character[] chars = new Character[word.length()];
            for (int k = 0; k < chars.length; k++)
                chars[k] = word.charAt(k);

            // sort the array
            Arrays.sort(chars, new Comparator<Character>() {
                public int compare(Character c1, Character c2) {
                    int cmp = Character.compare(
                            Character.toLowerCase(c1.charValue()),
                            Character.toLowerCase(c2.charValue())
                    );
                    if (cmp != 0) return cmp;
                    return Character.compare(c1.charValue(), c2.charValue());
                }
            });

            StringBuilder sb = new StringBuilder(chars.length);
            for (char c : chars) sb.append(c);
            word = sb.toString();

            if(word.equals(p)) res.add(i);
        }
        return res;
    }
}