class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
       HashMap<Character,Integer>magazineLetters=new HashMap<>();
        for(int i=0;i<magazine.length();i++)
        {
            char m = magazine.charAt(i);
            
            int k=magazineLetters.getOrDefault(m,0);
            magazineLetters.put(m,k+1);
        }
        
         for(int i=0;i<ransomNote.length();i++)
         {
             char r=ransomNote.charAt(i);
             
            int k=magazineLetters.getOrDefault(r,0);
             if(k==0)
                 return false;
             magazineLetters.put(r,k-1);
         }
        return true;
    }
}