"use strict"
/* 구구단을 출력하는 프로그램을 작성하시오.
-예)
> node test17.js
prompt: step: 5
5 * 1 = 5
.
.
.
.
.
5 * 9 =45
*/



var prompt = require('prompt');

prompt.start();

prompt.get(['step'], function(err, result) {
  var step = parseInt(result.step);

  for (var b = 1; b <= 9; b++)
    console.log(step + " * " + b + " = " + (step * b));
});
