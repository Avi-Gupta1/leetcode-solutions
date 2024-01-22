/**
 * @param {string} s
 * @return {string}
 */
var sortSentence = function(s) {
    let map=new Map();
    let arr=s.split(" ")
    for(let i=0;i<arr.length;i++){
        let digit=arr[i].slice(-1)
        let word=arr[i].slice(0,-1)
        map.set(digit,word)
    }
    let keys=Array.from(map.keys()).sort((a,b)=>a-b)
    let final=[]
    for(let i=0;i<keys.length;i++){
        final.push(map.get(keys[i]))
    }
    return final.join(" ")
};
