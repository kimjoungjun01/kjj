"use strict"

function calculator(op) {
  switch (op) {
    case "+":
      return function(a, b) {return a + b;}; //return 하게 되면 바로 값이 반환되어
                                             //break 가 필요 없다.
    case "-":
      return function(a, b) {
        return a - b;
      };
  }
}

var value = calculator("+")(11, 22);
console.log(value);
