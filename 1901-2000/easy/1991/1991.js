/**
 * @param {number[]} nums
 * @return {number}
 */
var findMiddleIndex = function(nums) {
    let leftsum=[]
    leftsum[0]=nums[0]
    let rightsum=[]
    rightsum[nums.length-1]=nums[nums.length-1]
    for(let i=1;i<nums.length;i++){
        leftsum[i]=nums[i]+leftsum[i-1]
    }
    for(let i=nums.length-2;i>=0;i--){
        rightsum[i]=nums[i]+rightsum[i+1]
    }
    console.log(leftsum)
    console.log(rightsum)
    for(let i=0;i<nums.length;i++){
        if(leftsum[i]==rightsum[i]){
            return i
        }
    }
    return -1;
    
};