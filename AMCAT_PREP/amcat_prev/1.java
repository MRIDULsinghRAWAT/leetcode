package AMCAT_PREP;

//Count Pairs and Remaining Integers
public class 1 {
    public static void main(String[] args) {
        // Example input: 9 integers
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 1, 2};
        int n = arr.length;
        int []freq=new int[10001];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        //logic:
        // counting pairs and remaining integers
        // pairs = sum of freq[i] / 2 for all i 
        // mtlb 
        //sum of freq[i] means total occurence of each integer
        // freq[i] / 2 means how many pairs can be formed from those occurences
        // remaining = sum of freq[i] % 2 for all i


        
    }

}
    /*A company transmits a message consisting of integers. The transmission system can only send pairs of identical integers 
    (exactly two at a time). The process continues until no more such pairs can be formed.

Your task is to determine:
1. The total number of pairs transmitted
2. The total number of integers remaining unpaired

Input:
First line contains an integer N representing the number of integers.
Second line contains N space-separated integers.

Output:
Print two space-separated integers: pairs_transmitted and remaining_integers.
exmaple:
input:
9
1 2 3 2 1 4 5 1 2
output:
3 3
explaination:
Pairs formed: (1,1), (2,2), (2,2)
Remaining integers: 3, 4, 5


input :
10
1 1 1 1 2 2 2 3 3 4
output:
5 1
 explaination:
Pairs formed: (1,1), (1,1), (2,2), (2,2), (3,3)
Remaining integer: 4




 */

    

