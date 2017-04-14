"use strict"

function average(array){
  var result = 0
  for (var i = 0; i < array.length; i++) {
    result += array[i]
  }
  return result / array.length
}

// 아래는 테스트로 출력해 보기 위한 코드입니다.
var testArray = [8,19,15,-1,5,1,1,2,23,5,4]
console.log("평균값 : " + average(testArray));
