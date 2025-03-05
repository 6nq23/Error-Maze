function calculateAverage(arr) {
    let total = 0;
    // BUG: Loop condition uses '<=' causing an out-of-bound error.
    for (let i = 0; i <= arr.length; i++) {  
      total += arr[i];
    }
    return total / arr.length;
  }
  console.log(calculateAverage([10, 20, 30, 40, 50]));
  