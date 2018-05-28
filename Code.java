String[] composeRanges(int[] nums) {
    if(nums == null || nums.length == 0)
        return new String[0];
    
    List<String> res = new ArrayList<String>();
    int start = 0, end = start+1;
    
    while(end <= nums.length){
        if(end == nums.length || end - start != nums[end] - nums[start]){
            if(end - start == 1)
                res.add(nums[start] + "");
            else
                res.add(nums[start] + "->" + nums[end-1]);
            
            start = end;
        }
        
        end++;
    }
    
    return res.toArray(new String[0]);
}
