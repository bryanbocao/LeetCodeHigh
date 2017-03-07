package num288_UniqueWordAbbreviation;

import java.util.HashMap;
import java.util.Map;

public class ValidWordAbbr_20170301Wed {
    Map<String, Integer> map;
    public ValidWordAbbr_20170301Wed(String[] dictionary) {
        map = new HashMap<String, Integer>();
        for (String s : dictionary) {
            String abS = toAbS(s);
            if (map.keySet().contains(abS)) map.put(abS, map.get(abS) + 1);
            else map.put(abS, 1);
        }
    }
    
    public boolean isUnique(String word) {
        String abS = toAbS(word);
        if (map.keySet().contains(abS)) return false;
        return true;
    }
    
    private String toAbS(String s) {
        if (s.length() <= 2) return s;
        StringBuilder abSB = new StringBuilder();
        abSB.append(s.charAt(0));
        abSB.append(s.length() - 2);
        abSB.append(s.charAt(s.length() - 1));
        String abS = abSB.toString();
        return abS;
    }
}

/**
 * Your ValidWordAbbr object will be instantiated and called as such:
 * ValidWordAbbr obj = new ValidWordAbbr(dictionary);
 * boolean param_1 = obj.isUnique(word);
 */
/*
["ValidWordAbbr","isUnique"]
[[["hello"]],["hello"]]
Output:
[null,false]
Expected:
[null,true]
*/