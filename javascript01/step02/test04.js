"use strict"
var a;
//전위 연산자
a = 10;
console.log(++a);

a = 10;
console.log(--a);



//후위 연산자
a = 10;
console.log(a++);
console.log(a + 1);

a = 10;
a = a++;
//결국 a의 값은 10이된다
console.log(a);
console.log(a + 1);

a = 10;
console.log(a--);


a = 10;
console.log(a++);  //a의 값은 11이되고
console.log(a--);  //a 값이 10이된다 그러나 출력은 11


a = 10;
a = ++a;
console.log(a);

console.log("-----------------------")

a = 10;
var r = a++ + a++ + a++ + a--;
console.log(r, a);

a = 10;
var r = a++ + a-- + a++ + a++;
console.log(r, a);
