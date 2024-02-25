/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    let arr=s.split(" ")
    let final=[]
    for(let i=0;i<arr.length;i++){
        final.push(arr[i].split("").reverse().join(""))
    }
    return final.join(" ")
    
};
