/**
 * @param {string} num
 * @return {string}
 */
var removeTrailingZeros = function(num) {
    let newArr = num.split('')
    for(let i = newArr.length -1 ; i >=0 ; i--){
        if(newArr[i] == 0){
            newArr.splice(i,1)
        } else {
            break ;
        }
            
    }

    const res = newArr.join('')
    return res
};