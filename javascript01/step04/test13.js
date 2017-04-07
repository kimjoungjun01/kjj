"use strict"

function calculator(op) {
  switch (op) {
    case "+":
      return (a, b) => a + b;
    case "-":
      return (a, b) => a - b;
  }
}

var f = calculator("+");

var value = f(10, 20);
console.log(value);

f = calculator("-");
value = f(10, 20);
console.log(value);

value = calculator("-")(10, 20);
console.log(value);
console.log(calculator("-")(10, 20));
