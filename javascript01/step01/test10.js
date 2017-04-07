"use strict"
var name = "홍길동";
{
  var name = "임꺽정";
  console.log(name);
}
console.log(name);


{
  var age = 20;
}
console.log(age);

//단, 자바에선 블록 안과 밖의 변수가 다르다
//즉, 블록에 제한 받는다.
