public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> list = new ArrayList<>();
        for(int i=0;i<magazine.length();i++){
            list.add(magazine.charAt(i));
        }
        for(int i=0;i<ransomNote.length();i++){
            if(list.contains(ransomNote.charAt(i))) list.remove(Character.valueOf(ransomNote.charAt(i)));
            else return false;
        }
        return true;
    }
}