/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var subsets = function(nums) {
    let res=[]
    let temp=[]
    function subset(nums,i){
        if(i==nums.length){
            return res.push([...temp])
        }
        temp.push(nums[i])
        subset(nums,i+1)
        temp.pop()
        subset(nums,i+1)
    }
    subset(nums,0)
    return res;
};
