"use strict"
//예외 처리
function divide(a, b) {
  if(b == 0)
    throw {errorCode: 400, message: '0으로 나눌 수 없다'}
  return a / b
}



try {
  var result = divide(12121212, 0)
  console.log(result)

} catch (error) {
  console.log(error.message)
}
