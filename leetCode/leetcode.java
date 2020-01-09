class Solution {
    public int[] twoSum(int[] nums, int target) {

        String mid;
        int[] result = new int[2];
        HashMap<String, String> hm = new HashMap<>();
        for(int i=0; i < nums.length() ; i++){
            hm.put((String)nums[i],i);
        }
        for(int i=0;i<nums.length();i++){
            mid = (String)target - nums[i];
            if(hm.get(mid)!=null){
                result[0]=i;
                result[1]=hm.get(mid);

            }


        }

        return result;




    }


}