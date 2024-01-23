/**
 * @param {string} s
 * @return {string}
 */
var finalString = function(s) {
    let arr=s.split('')
    if(!arr.includes("i")){
        return s
    }
    for(let i=0;i<arr.length;i++){
        if(arr[i]=='i'){
            return finalString(s.slice(0,i).split("").reverse().join("")+s.slice(i+1))
        }
    }
};
