
"use strict"

var value = 10;
if ((value % 2) == 0)
  console.log("짝수입니다.");

console.log("------------------------");



var value = 11;
if ((value % 2) == 0) //주의!
  console.log("짝수");
  console.log("입니다.");

console.log("------------------------");


var value = 11;
if ((value % 2) == 0);   //<------------------- 주의!
  console.log("짝수입니다.");

console.log("-------------------------");


var value = 10;
if ((value % 2) == 0) {
  console.log("짝수");
  console.log("입니다.");

}
console.log("--------------------------");

var value = 11;
if ((value % 2) == 0) {
  console.log("짝수");
  console.log("입니다.");
}
