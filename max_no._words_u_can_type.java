class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {


int countkarde=0;
boolean isbroken =false;

for(int i=0;i<text.length();i++){
    char ch = text.charAt(i); 
    // yeh thora saaa jaanaaa tha mujhe ab clear hiogaya hai 


// yeh hamesha confusing hora tha isse dhyaan se smjhna
if(brokenLetters.indexOf(text.charAt(i) )!= -1){
isbroken =true;
    //  !=  hai tab  character string ke andar mila h 
    // aur 
    // == -1 hai to character nhi mila 
}

// space aya tab ka case bhi cover krrna padega 
if(ch== ' ')
{
    if (!isbroken) countkarde ++;
    isbroken =false;   // upar bhi reset hua tha =false krrke haar new word ke liye woi seen hai 
}  
 }

if(!isbroken ) countkarde++;
return countkarde;

    }
}

// jo maiii krra hoon usmei ek space wlaa seen bhi ayerga 