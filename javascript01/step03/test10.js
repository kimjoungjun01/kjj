
"use strict"

switch (undefined) {
  case "문자열":
    console.log("문자열 가능");
    break;
  case 1:
    console.log("숫자 가능");
    break;
  case true:
    console.log("불린값 가능");
    break;
  case 3.141592:
    console.log("부동소수점 가능");
    break;
  case undefined:
    console.log("undefined 가능");
    break;
  case null:
    console.log("null 가능");
    break;
  case NaN:
    console.log("NaN 불가능");
    break;
  default:
    console.log("필요 없습니다.");
}
console.log("--------------------------------");

var v = NaN;

if (v == NaN)
 console.log(NaN);
