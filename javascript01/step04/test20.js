

//비동기방식의 예
//함수내의 작업이 끝나지 않아도 즉시 리턴한다.
"use strict"
var prompt = require('prompt');

prompt.start();

prompt.get(['a', 'b'], function(err, result) {
  console.log("입력 값 출력 -----------------------");
  console.log(result.a, result.b);
});
console.log("하하하하하하........");
