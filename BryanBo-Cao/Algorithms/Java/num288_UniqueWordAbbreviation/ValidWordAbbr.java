package num288_UniqueWordAbbreviation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidWordAbbr {
    Map<String, Integer> map;
    Set<String> dicSet;
    public ValidWordAbbr(String[] dictionary) {
        map = new HashMap<String, Integer>();
        dicSet = new HashSet<String>();
        for (String s : dictionary) {
        	dicSet.add(s);
            String abS = toAbS(s);
            if (s.length() <= 2 && dicSet.contains(abS)) continue;
            else if (map.keySet().contains(abS)) map.put(abS, map.get(abS) + 1);
            else map.put(abS, 1);
        }
    }
    
    public boolean isUnique(String word) {
        String abS = toAbS(word);
        if (map.keySet().contains(abS)) {
            if (map.get(abS) == 1 && dicSet.contains(word)) return true;
            return false;
        }
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

Input:
["ValidWordAbbr","isUnique"]
[[["a","a"]],["a"]]
Output:
[null,false]
Expected:
[null,true]
*/
//SolvedOn20170301WedNight CodingDuration:33m26s74