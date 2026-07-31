class Solution { 
    public int numberOfSpecialChars(String word) { 
        int special = 0; 
        String specialch = "";
        

        for (int i = 0; i < word.length(); i++) { 
            char current = word.charAt(i); 
            
            if (Character.isUpperCase(current) &&  specialch.indexOf(current) ==-1) { 
                char lowerChar = Character.toLowerCase(current); 
                
                if (word.indexOf(lowerChar) != -1) { 
                    special += 1; 
                    specialch += current;
                } 
            } 
        } 
        return special; 
    } 
}
