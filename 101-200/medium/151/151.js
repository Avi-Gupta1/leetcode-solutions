/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    let arr=s.split(" ")
    let stack=[]
    let result="";
    for(let i=0;i<arr.length;i++){
        stack.push(arr[i])
    }
    while(stack.length){
        const curr=stack.pop()
        if(curr){
            result+=" "+curr
        }
    }
    return result.trim()
};
