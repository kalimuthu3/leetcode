class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        int num1=num;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
            }if(sum==num1){
                return true;
            }else{
                return false;
        }
        
    }
}