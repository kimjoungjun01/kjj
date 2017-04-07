
"use strict"
var name;
console.log(typeof name);

name = "홍길동";
console.log(typeof name);

name = '임꺽정';    // '' 이거나 "" 이거나 같음 java에서는 다르지만 js에선 같음
console.log(typeof name);

name = 20;
console.log(typeof name);

name = 3.14;
console.log(typeof name);

name = true;
console.log(typeof name);

name = new Object();
console.log(typeof name);

name = [];
console.log(typeof name);

name = function() {};
console.log(typeof name);

name = null;
console.log(typeof name);

name = undefined;
console.log(typeof name);

name = NaN; //Not A Number
console.log(typeof name);
