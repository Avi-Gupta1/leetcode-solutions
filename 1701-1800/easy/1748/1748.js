/**
 * @param {number[]} nums
 * @return {number}
 */
var sumOfUnique = function(nums) {
    let map=new Map();
    let sum=0;
    for(let i=0;i<nums.length;i++){
        if(map.has(nums[i])){
            map.set(nums[i],map.get(nums[i])+1)
        }
        else{
            map.set(nums[i],1)
        }
    }
    for(let [key,value] of map){
        if(value==1){
            sum=sum+key
        }
    }
    return sum    
};
