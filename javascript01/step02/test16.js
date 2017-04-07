"use strict";



var v0;
if (v0 == undefined) console.log("v0는 변수는 존재하나 값이 없는 상태이다.");
console.log("-----------------------------------------------------------------")


var v1 = 20;
v1 = undefined;
if (v1 == undefined) console.log("v1은 변수는 존재하나 값이 없는 상태이다.");
if (v1) console.log("v1는 false로 바뀐다.");
console.log("-----------------------------------------------------------------")
//if(x == undefined) console.log("x는 undefined이다.");

var v2 = null;
console.log("v2의 타입", typeof v2);
if (v2 == null) console.log("v2는 null이다.");
if (v2) console.log("v2는 null이다.");
console.log("-----------------------------------------------------------------")


var v3 = NaN;
console.log("v3의 타입", typeof v3);
if (v3 == NaN) console.log("v3는 NaN 이다.");
if (isNaN(v3)) console.log("v3는 isNaN(v3) == true 이다.");
console.log("-----------------------------------------------------------------")


var v4 = Infinity;
if (v4 == Infinity) console.log("v4는 Infinity이다");
if (v4) console.log("v4는 Infinity이다.");
