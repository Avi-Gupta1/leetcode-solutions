/**
 * @param {string[]} words
 * @return {number}
 */
var uniqueMorseRepresentations = function(words) {
    let mapping={
        a:".-",
        b:"-...",
        c:"-.-.",
        d:"-..",
        e:".",
        f:"..-.",
        g:"--.",
        h:"....",
        i:"..",
        j:".---",
        k:"-.-",
        l:".-..",
        m:"--",
        n:"-.",
        o:"---",
        p:".--.",
        q:"--.-",
        r:".-.",
        s:"...",
        t:"-",
        u:"..-",
        v:"...-",
        w:".--",
        x:"-..-",
        y:"-.--",
        z:"--.."
    }
    let arr=[]
    for(let i=0;i<words.length;i++){
        let str=""
        for(let j=0;j<words[i].length;j++){
            str+=mapping[words[i][j]]
        }
        str+=" "
        arr.push(str)
    }
    return new Set(arr).size;
};
