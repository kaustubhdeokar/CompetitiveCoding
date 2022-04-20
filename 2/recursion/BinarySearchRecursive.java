class BinarySearchRecursive {
    //recursive karke dekhte hain
    
    public int search(int[] nums, int target) {
        
        
        int start = 0;
        int end = nums.length-1;
        
        return binarySearch(nums,target,start,end);
        
    }
    
    public int binarySearch(int[] nums,int target,int start,int end){
        
        if(start>end)
            return -1;
        
        int mid = start+(end-start)/2;
        
        if(nums[mid]==target)
            return mid;
        
        else if(nums[mid]>target)
            return binarySearch(nums,target,start,mid-1);
        
        else
            return binarySearch(nums,target,mid+1,end);
        
        
    }
    
    
}
