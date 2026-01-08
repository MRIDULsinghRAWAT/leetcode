package AMCAT_PREP.amcat_prev;
public class 3 {
    // find second largest distinct in array
    public static void main(String[] args) {
        int[] arr={5,3,8,1,4};
    
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){  // current element > largest ... then largest becomes the second largest
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest && arr[i]!=largest){// curr elmt > largest && curr elemrn !=largest
                secondLargest=arr[i];
            }
            }
            System.out.println("Second largest distinct element is: "+secondLargest);
        }
    } // logic :
        // 1. find largest
        // 2. find second largest distinct

        // approach:
        // 1. initialize largest and second largest
        // 2. traverse array
        // 3. if current element > largest, update second largest and largest
        // 4. else if current element > second largest and current element != largest, update second largest