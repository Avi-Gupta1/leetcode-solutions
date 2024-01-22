/**
 * @param {string} key
 * @param {string} message
 * @return {string}
 */
var decodeMessage = function(key, message) {
    let temp=Array.from(new Set(key.split(" ").join("").split(""))).join("")
    let alphabet="abcdefghijklmnopqrstuvwxyz"
    let map=new Map();
    for(let i=0;i<temp.length;i++){
        map.set(temp[i],alphabet[i])
    }
    let answer=""
    for(let i=0;i<message.length;i++){
        if(map.has(message[i])){
            answer+=map.get(message[i])
        }
        else{
            answer+=" "
        }
    }
    return answer
    
};