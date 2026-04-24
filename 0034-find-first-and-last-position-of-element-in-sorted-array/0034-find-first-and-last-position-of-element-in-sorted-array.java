class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]={-1,-1};
        arr[0]=first(nums,target);
        arr[1]=last(nums,target);
        return arr;
    }
    public int first(int nums[],int target){
        int low=0;
        int high=nums.length-1;
        int idx=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==nums[mid]){
                idx=mid;
                high=mid-1;
            }
            else if(target<nums[mid])high=mid-1;
            else low=mid+1;
           

        }
         return idx;
        }

        public int last(int nums[],int target){
        int low=0;
        int high=nums.length-1;
        int idx=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==nums[mid]){
                idx=mid;
                low=mid+1;
            }
            else if(target<nums[mid])high=mid-1;
            else low=mid+1;
           

        }
         return idx;
        }   
    }