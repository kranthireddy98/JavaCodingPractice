package ArraysAssignment;

//Leet code 287
public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        duplicate(nums);
    }

    // Tortoise and Hare
    //Floyd’s Cycle Detection
    private static void duplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Finding the intersection point
        do {
            slow = nums[slow]; // move one step
            fast = nums[nums[fast]]; // move 2 steps
        }while (slow != fast);

        fast = nums[0]; // back to starting

        // Phase 2: Finding the entrance to the cycle (the duplicate)
        while (slow!=fast){
            slow=nums[slow]; // move one step
            fast=nums[fast]; // move one step
        }

        System.out.println(slow);
    }
}
