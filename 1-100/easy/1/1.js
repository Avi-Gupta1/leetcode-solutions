/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    // O(N2)
    // for(let i=0;i<nums.length;i++){
    //     let find=target-nums[i]
    //     for(let j=i+1;j<nums.length;j++){
    //         if(nums[j]==find){
    //             return [i,j]
    //         }
    //     }
    // }

    let map=new Map();
    for(let i=0;i<nums.length;i++){
        if(map.has(target-nums[i])){ 
            return [map.get(target-nums[i]),i]
        }
        else{
            map.set(nums[i],i)
        }
    }
    
};