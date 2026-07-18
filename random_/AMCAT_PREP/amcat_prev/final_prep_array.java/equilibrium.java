package AMCAT_PREP.amcat_prev.final_prep_array.java;
public class equilibrium {
    public static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;   // setep 1-> calculate total sum
        }
        //step2 -> traverse the array and keep track of left sum
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // now totalSum is right sum for index i

            // step 3 -> check if left sum equals right sum
            if (leftSum == totalSum) {
                return i; // equilibrium index found
            }
            leftSum += arr[i];
        }
        return -1; // no equilibrium index found
    }




    public static void main(String[] args) {
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        int equilibriumIndex = findEquilibriumIndex(arr);
        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium index: " + equilibriumIndex);
        } else {
            System.out.println("No equilibrium index found.");
        }
    }
    
}
