"use strict"

function calculator(op) {
  switch (op) {
    case "+":
      return function(a, b) {return a + b;};
    case "-":
      return function(a, b) {
        return a - b;
      };
  }
}

var f = calculator("+");

var value = f(10, 20);
console.log(value);

f = calculator("-");
value = f(10, 20);
console.log(value);

value = calcultor("-")(10, 20)
console.log(value);
console.log(calcultor("-")(10, 20));
