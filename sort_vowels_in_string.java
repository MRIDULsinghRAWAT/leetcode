class Solution {
    public String sortVowels(String s) {
    


// agar vowel hai to usmei to upper case wale lower wale se vowel se interchange honge ... upper case phele aane cahaiaye 

/**

1. extratct krr dio sort variables 
2. sort krrio
3. fir modify krrdiuo sorted wala ...
 */

int[] frequency= new int [128];
String v ="aeiouAEIOU";  // krrte h isse thik 

 // iterate krrne ke liye loop  --- haar character pe 
 for(char ch: s.toCharArray()){
    if(v.indexOf(ch)!=-1){   // to check if current ch is vowel or not ! 
        frequency[ch]++;
    }
 }

// string  builder ka bhi use krr sakhte hai hukm  yahan pe 
int k=0;
StringBuilder sortedstring =new StringBuilder();
 for(char ch:s.toCharArray()){
    if(v.indexOf(ch)!=-1){      // same hi likhre
        while (k<128 && frequency[k]==0) k++;

          sortedstring.append((char)k);
frequency[k]--;
    }
    else sortedstring.append(ch);
    }

return sortedstring.toString();

    }
}