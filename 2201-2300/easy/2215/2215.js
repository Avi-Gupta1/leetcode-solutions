/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[][]}
 */
var findDifference = function(nums1, nums2) {
    let ans1=[]
    let ans2=[]
    nums1=Array.from(new Set(nums1))
    nums2=Array.from(new Set(nums2))
    for(let i=0;i<nums1.length;i++){
        if(!nums2.includes(nums1[i])){
            ans1.push(nums1[i])
        }
    }
    for(let i=0;i<nums2.length;i++){
        if(!nums1.includes(nums2[i])){
            ans2.push(nums2[i])
        }
    }
    return [ans1,ans2]
};