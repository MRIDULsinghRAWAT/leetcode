public class longest_substring_without_repeating_characters {
  public int lengthOfLongestSubstring(String s) {

        // TOUGH QUESTION BITCH ! 


/**yeh wala step dekh 
frequency of eachhh char in current window store  */
     int[] freq = new int[256];


int left =0;
int right =0;
int maxLength=0;


while(right < s.length()){
    char ch =s.charAt(right);

freq[ch]++;    /////////
// add this char to the window

 // if char repeats->  shrink window from left
       while (freq[ch] > 1) { 
        // "Jab tak yeh character duplicate hai, window ko chhota karo".
freq[s.charAt(left)]--; // left wale character remove karo
 left++;
    }

maxLength = Math.max(maxLength, right - left + 1);  
 // valid window checking in each step 
            right++;
        }return maxLength;

    }
}


// // string builder ka use krrte h 
// //efficiently string banane, jodne, aur modify karne mein help karta hai.

// int i = a.length()-1;  
//  // last index yehi hota h a.length() - 1;
// int j = b.length() - 1;
      
// int carry = 0;
//         /*int carry = 0;
// Jab tum binary digits add karte ho, to 1 + 1 = 10 hota hai
// 0 result, 1 carry
// Yeh carry variable tumhara extra digit track karta hai jo agle digit me add hoga.*/

// while(i>=0 || j>=0 || carry!=0){
    




// }


//   }
// }  

