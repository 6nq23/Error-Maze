function calculateAverage(arr) {
    let total = 0;

    for (let i = 0; i <= arr.length; i++) {  
      total += arr[i];
    }
    return total / arr.length;
  }
  console.log(calculateAverage([10, 20, 30, 40, 50]));
  