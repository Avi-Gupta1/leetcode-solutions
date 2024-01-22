/**
 * @param {string[]} words
 * @param {string} s
 * @return {boolean}
 */
var isAcronym = function(words, s) {
    let arr=[]
    for(let i=0;i<words.length;i++){
        arr.push(words[i].slice(0,1))
    }
    // console.log(arr.join(""))
    return arr.join("")===s
    
};
