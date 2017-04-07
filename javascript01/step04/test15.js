"use strict"
//에러 아닌 이유
//함수안에 내장변수(arguments) 존재
//배열이며, 파라미터 개수에 상관없이 전부 보관한다.
function f1() {
  console.log(arguments.length)
  console.log(arguments)
  console.log("-----------------")
}

f1()
f1(10)
f1(10, 20)
f1(10, 20, 30)
f1(10, 20, 30, 40)

function f2(a, b) {
  console.log(arguments.length)
  console.log(arguments)
  console.log(a, b)
  console.log("---------------")
}

f2()
f2(10)
f2(10, 20)
f2(10, 20, 30)
f2(10, 20, 30, 40)

//입력하고자 할 파라미터의 개수가 고정적이지 않을때 arguments를 쓴다
function sum(a, b) {
  var result = 0;
  for (var value of arguments) {
    result += value;

  }
  return result;
}

console.log(sum());
console.log(sum(10, 20));
console.log(sum(10, 20, 30, 40, 50));
