function factorial(n) {
    if (n === 0) {
      return 1;
    } else {
      // BUG: Recursive call uses an incorrect function name 'fact'
      return n * fact(n - 1);
    }
  }
  console.log(factorial(5));
  