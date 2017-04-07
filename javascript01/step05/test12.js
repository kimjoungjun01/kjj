//this 변수
"use strict"

function f1() {
  console.log(this)
}

new f1()//new 연산자를 줄때에 this가 생성되며
//객체안에 함수를 집어넣을때에도 생성된다
//즉 그냥 함수를 만들때에는 this가 생겅되지 않는다

f1()

var obj = {
  f2 : function() {
    console.log(this)
  }
}
//객체안에 함수를 만들때에도 this가 생성된다.

obj.f2();
//f2() 당연히 객체에 포함된 함수는 그냥 호출할 수 없다.
