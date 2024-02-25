/**
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */
var mergeAlternately = function(word1, word2) {
    let str=""
    let word1len=word1.length;
    let word2len=word2.length;
    let max=word1len>word2len?word1len:word2len;
    for(let i=0;i<max;i++){
        if(word1[i]){
            str+=word1[i]
        }
        if(word2[i]){
            str+=word2[i]
        }
    }
    console.log(str)
    return str
    
};