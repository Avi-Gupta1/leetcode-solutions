/**
 * @param {string} s
 * @param {number} k
 * @return {string}
 */
var truncateSentence = function(s, k) {
    let arr=s.split(" ")
    let final=[]
    for(let i=0;i<k;i++){
        final[i]=arr[i]
    }
    return final.join(" ")
    
};