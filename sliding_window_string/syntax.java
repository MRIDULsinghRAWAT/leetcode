// String ko char array mein convert karo (Fast performance ke liye)
char[] arr = s.toCharArray();
int n = arr.length;

int currentVal = 0; // Window ka current state tracking

// 1. Pehli Window ka data process karo (0 se k-1 tak)
for (int i = 0; i < k; i++) {
    // Yahan logic likho (e.g., if vowel, currentVal++)
}
int maxVal = currentVal; // Global result initialize karo

// 2. Window ko slide karo (k se n-1 tak)
for (int i = k; i < n; i++) {
    // A. Naya element window ke andar aaya (Right Pointer)
    char nextChar = arr[i];
    // Naye element ka logic update karo (e.g., currentVal++)

    // B. Purana element window se bahar gaya (Left Pointer)
    char prevChar = arr[i - k];
    // Purane element ka logic remove karo (e.g., currentVal--)

    // C. Apne global maximum/minimum ko update karo
    maxVal = Math.max(maxVal, currentVal);
}