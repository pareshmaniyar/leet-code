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
    let nums = nums.sort();//nlogn
    for(){
        
    }
    function binarySearch(num, start, end) { //logn
        if(num == nums[start]) {
            return start;
        }
        if(num == nums[end]) {
            return end;
        }
        let mid = start + (start + end) / 2;
        if(num == nums[mid]) {
            return mid;
        }
        if(num > nums[mid]) {
            return binarySearch(num, mid + 1, end)
        } else {
            return binarySearch(num, start, mid);
        }
        return -1;
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
