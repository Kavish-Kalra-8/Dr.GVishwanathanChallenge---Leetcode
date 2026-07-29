import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        
        StringBuilder sb = new StringBuilder(s);

        int n = 0;

        HashMap< Character , Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
                
        for(int i = 0 ; i< sb.length() ; i ++){
            
            int curr = map.get(sb.charAt(i));

            if( i < sb.length() - 1){

                int next = map.get(sb.charAt(i+1));

                if(curr<next){
                    n -= curr;
                }
                else{
                    n += curr;
                }
            }
            else{
                n += curr;
            }
        }
        return n;
    }
}




            
