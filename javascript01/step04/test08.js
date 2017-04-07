"use strict"

var f1 = () => "hello" //Arrow 함수에서는 마지막 문장의 실행결과가
//자동으로 리턴값이된다 (간단한문장일때만, 대략 한줄)
var value = f1();
console.log(value);



var f2 = () => console.log("okok"); //값이없어 리턴하지 않는다.
//리턴값이 없으므로 undefined
var value = f2();
console.log(value);


//블록이 주어지면 자동으로 리턴이 되지않으므로 return 을 주어야 한다.
var f3 = () => {
  console.log("--------------------");
  console.log("f3... 호출됨");
  console.log("Arrow 함수임.");
  return "hello2";
}
value = f3();
console.log(value);


var f4 = (a, b) => a + b;
value = f4(10, 20);
console.log(value);


function test(a, b) {
  console.log(a + b);
}
test(10, 20);
