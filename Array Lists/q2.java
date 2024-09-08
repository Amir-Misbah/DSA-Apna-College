import java.util.*;
public class q2 {  // Renamed the class to match the filename and used 'Q2' as the class name
    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        // Step 1: Sort the ArrayList
        Collections.sort(nums);
        
        // Step 2: Initialize a new ArrayList to hold the lonely numbers
        ArrayList<Integer> list = new ArrayList<>();
        
        // Step 3: Iterate through the list and find lonely numbers
        for (int i = 1; i < nums.size() - 1; i++) {
            // A number is lonely if the previous number + 1 is not equal to the current number
            // and the current number + 1 is not equal to the next number
            if (nums.get(i - 1) + 1 != nums.get(i) && nums.get(i) + 1 != nums.get(i + 1)) {
                list.add(nums.get(i));
            }
        }
        
        // Step 4: Handle the edge cases for the first and last elements
        if (nums.size() == 1) {
            // If there is only one element, it is lonely by definition
            list.add(nums.get(0));
        } else if (nums.size() > 1) {
            // Check the first element
            if (nums.get(0) + 1 != nums.get(1)) {
                list.add(nums.get(0));
            }
            // Check the last element
            if (nums.get(nums.size() - 2) + 1 != nums.get(nums.size() - 1)) {
                list.add(nums.get(nums.size() - 1));
            }
        }
        
        // Step 5: Return the list of lonely numbers
        return list;
    }
    
    public static void main(String[] args) {
        // Q2 q2 = new Q2();  // Use the correct class name 'Q2'
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        
        ArrayList<Integer> result = findLonely(nums);
        System.out.println(result); // Output: [10, 8]
    }
}
