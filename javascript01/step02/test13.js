"use strict";

var r;
r = 10 + 2 * 3;
console.log(r);

r = (10 + 2) * 3;
console.log(r);

r = 10 - 3 + 7;
console.log(r);

r = 10 / 2 * 3;
console.log(r);

var a = 10;
r = a++ + a++ - a++;
console.log(r, a);



var a = 15;
r = a++ - a-- - a++;

console.log(r, a);
console.log(a++ - a-- - a++, a); //후위연산자의 경우 그 결과의 값을 명령하지 않아도
//a의값이 자동적으로 변한다 즉, console.log(a++ - a-- - a++, a); 이 부분에서 이미 a값이
//16인 상태로 시작하는 것이다.
