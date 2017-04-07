"use strict"

function f1(op, a, b) {
  switch (op) {
    case "+":
    console.log(a + b)
    break;
    case "-":
    console.log(a - b)
    break;
    default:
    console.log("다시 입력")
  }
}
f1("+", 10, 50)
var R = f1("+", 10, 50);//자동으로 실헹됨- 왜?



console.log(R);
//undefined
