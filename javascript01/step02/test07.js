"use strict";

var a = 10;
console.log(a << 1);
console.log(a << 2);
console.log(a << 3);
console.log(a << 4);
console.log(a << 10);
console.log(a << 999999999999999); //-21억 ~ 21억 사이의 수 까지만 표현할수있다




a = 175;
console.log(a >> 1);
console.log(a >> 2);
console.log(a >> 3);
console.log(a >> 4);
console.log(a >> 5);
console.log(a >> 7);
console.log(a >> 8);


a = -65;
console.log(a >> 1);


a = 65;
console.log(a >>> 1);

a = -65;
console.log(a >>> 1);
