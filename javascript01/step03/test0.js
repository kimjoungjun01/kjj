"use strict"

var prompt = require('prompt');

prompt.start();
prompt.get(['a', 'b', 'op'], function (err, result) {
  var a = parseInt(result.a);
  var b = parseInt(result.b);
  var op = result.op;

  switch (op) {
    case "+":
      console.log(a + op +  b + " = " + (a + b));
      break;
    case "-":
      console.log(a + op + b + " = " + (a - b));
      break;
    case "*":
      console.log(a + op + b + " = " + (a * b));
      break;
    case "/":
      console.log(a + op + b + " = " + (a / b));
      break;
    case "%":
      console.log(a + op + b + " = " + (a % b));
      break;
    default:
      console.log("ㄴㄴ");
  }
});
