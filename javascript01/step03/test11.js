

"use strict"
/*-다음 소스를 변경하여 사용자로부터 숫자 a, b 와 연산자 op 값을 받아서
계산결과를 출력하는 프로그램을 작성하라
-실행 결과:
> node test11.js
prompt: a: 10
prompt: b: 20
prompt: op: - 뺼지 더할지 묻게하라
계산 결과:
10 - 20 = -10
*/

var prompt = require('prompt');

prompt.start();

prompt.get(['a', 'b', 'op'], function(err, result) {
  var a = parseInt(result.a);
  var b = parseInt(result.b);
  var op = result.op;

switch (op) {
  case "+":
   console.log("a + b =", a + b);
   break;
  case "-":
   console.log("a - b =", a - b);
   break;
  case "*":
   console.log("a * b =", a * b);
   break;
  case "/":
   console.log("a / b =", a / b);
   break;
  case "%":
   console.log("a % b =", a % b);
   break;
  default:
  console.log("다시 입력하세용");

}});
