"use strict"
// 함수를 호출한뒤 이전으로 되돌아 오기 위해선 "스택 방식"으로 메모리
var v1 = 100;

function f1() {//함수는 함수 내의 식이 다끝날때까지 벗어날수 없다
               //이 방식을 "동기 방식" 이라한다.
  var v1 = 200;
  console.log("f1(:)", v1);//v1 = 200 값을 출력하고
  f2();                    //f2 함수 실행(호출)
  console.log("f1(:)", v1);//f2 함수의 작업(호출)이 다 끝나면 다시 v1값 출력
}

function f2() {
  var v1 = 300;
  console.log("f2(:)", v1);
  f3();
  console.log("f2(:)", v1);
}

function f3() {
  var v1 = 400;
  console.log("f3(:)", v1);
  }

f1()
