//동기방식 보여주는 예
"use strict"
/*function f1() {
  console.log("f1()..호출됨")
  while (true) {}
}
//함수에서 무한루프에 빠지면 더이상 실행할수 없음

f1()
console.log("hello")
*/
function f1() {
  console.log("f1()..호출됨")
  for (var i = 0; i < 100000000000000; i++)
  var d = 3.141592;
  var d2 = 3456.987;
  d =  d2 / d2 / d2 / d2 / d2 / d / d;
  d2 = d / d2 / d / d / d
}
//함수에서 시간이 지연되면 다음 명령의 실행에 지장을 준다

f1()
console.log("hello")
