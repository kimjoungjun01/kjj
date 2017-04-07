"use strict";

var a = 10;
var b = 12;

console.log("a & b =", a & b);
console.log("a | b =", a | b);
console.log("a ^ b =", a ^ b);
console.log("~a =", ~a);



var pixel = 0x34f588;
console.log((pixel & 0x00ff00).toString(16));


var pixel = 0x34f588;
var mask = 0xaa0000;
console.log((pixel | mask).toString(16));


var pixel = 0x34f588;
var mask = 0x34f588;
console.log((pixel ^ mask).toString(16));
console.log("--------------")
