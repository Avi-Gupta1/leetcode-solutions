/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    // let maxSum=nums[0]
    // let start=0;
    // let end=0
    // for(let i=0;i<nums.length;i++){
    //     let currentSum=0
    //     for(let j=i;j<nums.length;j++){
    //         currentSum+=nums[j]
    //         if(currentSum>maxSum){
    //             maxSum=currentSum
    //             start=i
    //             end=j
    //         }
        
    //     }
    // }
    // console.log(nums.slice(start,end+1))
    // return maxSum
    let sum=0;
    let maxSum=nums[0]
    for(let i=0;i<nums.length;i++){
        sum+=nums[i]
        if(sum>maxSum){
            maxSum=sum
        }
        if(sum<0){
            sum=0;
        }
    }
    return maxSum;
};
