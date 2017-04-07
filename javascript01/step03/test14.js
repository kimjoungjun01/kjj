"use strict"

for (var count = 1; count <= 10; count++) {
  console.log(count);
}
//var count = 1; 실행후 count <= 10; -> console.log(count); -> count++ 순으로 실행
console.log("-----------------------------------");

for (var a = 2; a <= 9; a++) {
  for (var b = 1; b <=9; b++) {
    console.log(a + " * " + b + " = " + (a * b));
  }
}
console.log("------------------------------------");

var names = ["홍길동", "임꺽정", "유관순", "한중근", "윤봉길", "김구"];

for (var i = 0; i < names.length; i++) {
  console.log(names[i]);
}
console.log("------------------------------------");
