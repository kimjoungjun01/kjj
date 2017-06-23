"use strict"
var name;
name = "홍길동";
var tel = "1111-2222";
var kor = 100;
var eng = 100;
var math = 100;

console.log(name, tel, kor, eng, math);



var name2 = "임꺽정",
    tel2 = "2222-2222",    //컴마를 찍는 방법도 가능
    kor2 = 90,
    eng2 = 90,
    math2 = 90;
console.log(name2, tel2, kor2, eng2, math2);

var a1 = [0, 1, 2, 3, 4];

a1[0] = "홍길동";
a1[1] = "1111-2222";
a1[2] = 100;
a1[3] = 100;
a1[4] = 100;

console.log(a1.length);
console.log(a1[1]);

//문자열 여러줄 입력
var str = "안녕하세요" +
          "홍길동입니다"
console.log(str)

var str2 = "안녕하세요 \
홍길동 \
입니다"
console.log(str2)
