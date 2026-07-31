class Solution { 
    public int numberOfSpecialChars(String word) { 
        int special = 0; 
        
        boolean lower [] = new boolean[26];
        boolean upper [] = new boolean[26];

        for(int i = 0 ; i < word.length() ; i++){

            char ch = word.charAt(i) ;

            if(ch <=122 && ch >=97){
                lower[ch - 'a'] = true;
            }
            if(ch <=90 && ch >=65){
                upper[ch - 'A'] = true;
            }
        }
        

        for (int i = 0; i <= 25; i++) { 
            
            if(lower[i] == true && upper[i] == true) special +=1;


        } 
        return special; 
    } 
}
