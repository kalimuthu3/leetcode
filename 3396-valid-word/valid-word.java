class Solution {
    public boolean isValid(String word) {
        int  s=word.length();
        if(s<3){
            return false;
        }
        int v=0;
        int c1=0;
        for(char c:word.toCharArray()){
            if(Character.isLetter(c)){
                if("aeiouAEIOU".indexOf(c)!=-1){
                    v++;
                }else{
                    c1++;
                }
                }else if(!Character.isDigit(c)){
                    return false;
                
            } 

        }return v>=1&&c1>=1;
        }
        
    }
