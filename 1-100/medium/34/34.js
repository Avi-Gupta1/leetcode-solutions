/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var firstElement=function(nums,target){
    let start=0;
    let end=nums.length-1;
    let ans=-1
    while(start<=end){
        let mid=Math.floor((start+end)/2)
        if(nums[mid]===target){
            ans=mid;
            end=mid-1;
        }
        else if(nums[mid]>target){
            end=mid-1;
        }
        else{
            start=mid+1
        }
    }
    return ans
}
var lastElement=function(nums,target){
    let start=0;
    let end=nums.length-1;
    let ans=-1
    while(start<=end){
        let mid=Math.floor((start+end)/2)
        if(nums[mid]===target){
            ans=mid;
            start=mid+1;
        }
        else if(nums[mid]>target){
            end=mid-1;
        }
        else{
            start=mid+1
        }
    }
    return ans
}
var searchRange = function(nums, target) {
    let first=firstElement(nums,target)
    let last=lastElement(nums,target)
    return [first,last]
};
