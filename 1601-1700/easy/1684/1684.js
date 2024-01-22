/**
 * @param {string} allowed
 * @param {string[]} words
 * @return {number}
 */
var countConsistentStrings = function(allowed, words) {
    let count = 0;
    let allow = allowed.split("");
    for (let i = 0; i < words.length; i++) {
        let isConsistent = true;
        for (let j = 0; j < words[i].length; j++) {
            if (!allow.includes(words[i][j])) {
                isConsistent = false;
                break;
            }
        }
        if (isConsistent) {
            count += 1;
        }
    }
    return count;
};
