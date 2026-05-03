import java.util.Scanner;

public class ActivityGroups {

    // Algorithm to find the number of students in a particular group
    public static int countStudentsInGroup(int n, int[] studentGroups, int targetGroup) {

int count=0;
for(int i=0;i<n;i++){
    if(studentGroups[i]==targetGroup) count++;

}

return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter total number of students: ");
            int n = sc.nextInt();

            int[] studentGroups = new int[n];
            System.out.println("Enter the group IDs (0-9) for each student:");
            for (int i = 0; i < n; i++) {
                studentGroups[i] = sc.nextInt();
            }

            System.out.print("Enter the target activity group ID to count: ");
            int targetGroup = sc.nextInt();

            // Calling the algorithm
            int result = countStudentsInGroup(n, studentGroups, targetGroup);

            System.out.println("\n-------------------------------------------");
            System.out.println("Students in group " + targetGroup + ": " + result);
            System.out.println("-------------------------------------------");

        } catch (Exception e) {
            System.out.println("Error: Please enter valid integers.");
        } finally {
            sc.close();
        }
    }
}
     /**2. In a school, there are activity groups. Each group has been identified by a digit from 0 to 9. The school principal

wants to find out how many students are in a particular activity group so that the school administration can

provide a classroom for the activity according to the number of students.

Write an algorithm for the school management to find the number of students who belongs to a particular

activity group. */ 