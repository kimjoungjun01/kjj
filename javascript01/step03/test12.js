"use strict"

var count = 1;

while (count <= 10)
 console.log(count++);
console.log("----------------------------------");



var a = 2;



while (a <=9) {
  var b = 1;
  while (b <= 9) {
  console.log(a + " * " + b + " = " + (a * b)); //저 + 는 사칙연산의 이미가 아닌 a를
  //문자열로 바꿔서 ""안의 문자열과 붙인다는 의미
   b++;
 }
 a++;
}
console.log("----------------------------------");
