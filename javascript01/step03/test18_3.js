"use strict"
//쓰로우 적용 후!
function divide(a, b) {
  if(b == 0)
    throw {errorCode: 400, message: '0으로 나눌 수 없다'}
  return a / b

}
var result = divide(10, 0)
console.log(result)
//하지만 쓰로우는 실행을 멈춘다
//이럴경우 문제가 되는경우가 있는데 이경우는 test18-4를 보라
