"use strict"

var f1 = function() {
  console.log("익명함수1.......");
}

var f2 = () => {console.log("Arrow 함수");}
var f3 = () => console.log("Arrow 함수2");


f1();
f2();
f3();
