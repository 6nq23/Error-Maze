function mergeObjects(obj1, obj2) {
    let merged = Object.assign({}, obj1);
    for (let key in obj2) {
      if (merged.hasOwnProperty(key)) {
        merged[key] = merged[key] + obj2[key];
      } else {
        
        merged.key = obj2[key];
      }
    }
    return merged;
  }
  console.log(mergeObjects({a: 10, b: 20}, {b: 30, c: 40}));
  