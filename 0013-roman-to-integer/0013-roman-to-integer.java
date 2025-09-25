import java.util.Map;
import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
       Map <Character, Integer> map = new HashMap<>();
       map.put('I',1);
       map.put('V',5);
       map.put('X',10);
       map.put('L',50);
       map.put('C',100);
       map.put('D',500);
       map.put('M',1000);
       int number = map.get(s.charAt(s.length()-1));

       for(int i = s.length() - 2; i >= 0; i--)
       {
            int cur = map.get(s.charAt(i));
            if(cur >= map.get(s.charAt(i+1)))
                number += cur;
            else
                number -= cur;    
       } 

       return number;
    }
}


// Using switch instead of hashmap.

// class Solution {
//     public int romanToInt(String s) {
//         int total = 0;
//         for (int i = 0; i < s.length(); i++) {
//             int cur = value(s.charAt(i));
//             if (i + 1 < s.length() && cur < value(s.charAt(i + 1)))
//                 total -= cur;
//             else
//                 total += cur;
//         }
//         return total;
//     }

//     private int value(char c) {
//         switch (c) {
//             case 'I': return 1;
//             case 'V': return 5;
//             case 'X': return 10;
//             case 'L': return 50;
//             case 'C': return 100;
//             case 'D': return 500;
//             case 'M': return 1000;
//         }
//         return 0;
//     }
// }
