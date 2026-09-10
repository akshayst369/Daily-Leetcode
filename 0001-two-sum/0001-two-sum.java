class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [][]arr = new int[nums.length][2];
        for(int i=0; i<nums.length; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        int left = 0;
        int right = nums.length-1;
        Arrays.sort(arr,(a,b)-> Integer.compare(a[0],b[0]));
        while(left<right)
        { 
            int sum =  arr[left][0] + arr[right][0];
            if(sum == target) {
                return new int[] {arr[left][1],arr[right][1]};
            }
            if(sum < target) {
                left++;
            }
            if(sum > target){
                right--;
            }
        }
        return new int[] {-1,-1};
    }
}