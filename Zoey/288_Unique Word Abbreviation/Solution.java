public class ValidWordAbbr {

    HashMap<String,String> map;
    public ValidWordAbbr(String[] dictionary) {
        map = new HashMap<>();
        for(int i=0;i<dictionary.length;i++){
            String word = dictionary[i];
            String abbr = Abbr(word);
            if(!map.containsKey(abbr)) map.put(abbr,word);
            else{
                if(!map.get(abbr).equals(word)) map.put(abbr,"");
            }
        }
    }

    public boolean isUnique(String word) {
        String abbr = Abbr(word);
        if(map.containsKey(abbr) && map.get(abbr).equals(word))
            return true;
        else if(!map.containsKey(abbr))
            return true;
        else return false;
    }

    public String Abbr(String word){
        if(word.length()<2) return word;
        return word.charAt(0)+Integer.toString(word.length()-2)+word.charAt(word.length()-1);
    }
}


// Your ValidWordAbbr object will be instantiated and called as such:
// ValidWordAbbr vwa = new ValidWordAbbr(dictionary);
// vwa.isUnique("Word");
// vwa.isUnique("anotherWord");