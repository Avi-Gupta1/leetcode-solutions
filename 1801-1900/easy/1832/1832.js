/**
 * @param {string} sentence
 * @return {boolean}
 */
var checkIfPangram = function(sentence) {
    let arr=new Set(sentence.split(""))
    return arr.size===26;    
};
