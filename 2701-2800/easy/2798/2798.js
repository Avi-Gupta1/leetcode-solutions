/**
 * @param {number[]} hours
 * @param {number} target
 * @return {number}
 */
var numberOfEmployeesWhoMetTarget = function(hours, target) {
    // O(N)
    let count=0
    for(let i=0;i<hours.length;i++){
        if(hours[i]>=target){
            count+=1
        }
    }
    return count
};