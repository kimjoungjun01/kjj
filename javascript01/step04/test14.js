"use strict"

function f1(a, b) {
  console.log(a, b)
}

f1(10, 20)
f1(20, 30)


// 오류 아님 예시
f1();
f1(10);
f1(10, 20, 30);
f1(10, 20, 30, 40);
