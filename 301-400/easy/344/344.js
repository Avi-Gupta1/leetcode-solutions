/**
 * @param {character[]} s
 * @return {void} Do not return anything, modify s in-place instead.
 */
var reverseString = function(s) {
    let left=0;
    let right=s.length-1
    recurssive(left,right,s)
    return s;
};
var recurssive=function(left,right,s){
    if(left>=right) return
    let temp=s[left]
    s[left]=s[right]
    s[right]=temp
    recurssive(left+1,right-1,s)
}
