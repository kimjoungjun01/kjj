"use strict"

var a1 = ["홍길동", 99, 98, 97];
console.log(a1[1]);

var v1 = a1;
a1[1] = 88;
console.log(v1[1]);

//------------------------------------------------------
var x = 10;
var y = x;
x = 20;

console.log(y);

var x = 10;
x = 20;
var y = x;

console.log(y);
