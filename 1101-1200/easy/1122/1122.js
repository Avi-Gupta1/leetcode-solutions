/**
 * @param {number[]} arr1
 * @param {number[]} arr2
 * @return {number[]}
 */
var relativeSortArray = function(arr1, arr2) {
    let map=new Map();
    let final=[]
    for(let i=0;i<arr1.length;i++){
        if(map.has(arr1[i])){
            map.set(arr1[i],map.get(arr1[i])+1)
        }
        else{
            map.set(arr1[i],1)
        }
    }
    for(let i=0;i<arr2.length;i++){
        for(let j=0;j<map.get(arr2[i]);j++){
            final.push(arr2[i])
        }
        map.delete(arr2[i])
    }

    let temp = Array.from(map.keys());
    temp.sort((a, b) => a - b);
    for (let i = 0; i < temp.length; i++) {
        for (let j = 0; j < map.get(temp[i]); j++) {
            final.push(temp[i]);
        }
    }
    return final;
};
