"use strict"

function init() {
  //아무것도 하지 않는다.
}
//{} 대신 new 를 사용하여 빈객체를 생성가능하며, 대신에
// new 연산자 다음에 빈 객체를 초기화시키는 함수를 호출하지 않으면 오류이다.
var obj = new init()
console.log(obj)
