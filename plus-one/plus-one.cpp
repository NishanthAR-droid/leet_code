class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        
                
         if((digits[digits.size()-1]+1)%10!=0)
            digits[digits.size()-1]++;
        
        else 
        {
            
          for(int i=digits.size()-1;i>=0;i--)
          {
              if((digits[i]+1)%10==0)
              {
                  digits[i]=0;
              }
              else
              {
                  digits[i]++;
                  break;
              }
          }
            
        }
        
        if(digits[0]==0)
            digits.insert(digits.begin(),1);
        
        return digits;
  }
};