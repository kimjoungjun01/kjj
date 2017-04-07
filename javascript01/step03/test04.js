
"use strict"

var value;
value = 11;

if ((value % 2) == 0)
  console.log("짝수입니다.");
if ((value % 2) != 0)
  console.log("홀수입니다."); //code 가 길어지고 계산을 두번하게 됨

console.log("-----------------------");

value = 11;

if ((value % 2) == 0)
  console.log("짝수입니다.");
else
  console.log("홀수입니다.");

console.log("-----------------------");

/*value = 11;
if ((value % 2) == 0)
  console.log("짝수입니다.");
console.log("이거 넣는 순간 에러(if 문이 종료되버림)");
else
  console.log("홀수입니다.");

console.log("-----------------------");
*/

value = 10;
if ((value % 2) == 0) {
  console.log("짝수입니다.");
  console.log("중괄호 {} 를 넣으면 오류 안남");
}
else
  console.log("홀수입니다.");

console.log("-----------------------");
