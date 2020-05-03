/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    //First solution - Brute Force
    //3 loops
    //if sum is zero, add to the main array
    let res = [];
    let finalResult = [];
    for(let i = 0; i < nums.length; i++) {
        for(let j = i + 1; j < nums.length; j++){
            for(let k = j + 1; k < nums.length; k++){
                res = [];
                res.push(nums[i]);
                res.push(nums[j]);
                res.push(nums[k]);
                if(nums[i] + nums[j] + nums[k] == 0 && isUnique(res)) {
                    finalResult.push(res);
                }
            }
        }
    }
    function isUnique(res) {
        for(let i = 0; i < finalResult.length; i++) {
            if(finalResult[i].sort().join() == res.sort().join()) {
                return false;
            }
        }
        return true;
    }
    return finalResult;
};
