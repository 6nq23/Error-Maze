function reverseString(str) {
    let reversed = "";
    
    for(let i = str.length; i >= 0; i--) {  
      reversed += str.charAt(i);
    }
    return reversed;
  }
  console.log(reverseString("hello"));
  