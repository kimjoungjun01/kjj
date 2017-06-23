"use strict"
//쓰로우 적용 전
function divide(a, b) {
  if(b == 0)
    return -12121212
  return a / b

}
var result = divide(10, 7)
console.log(result)


result = divide(12121212, -1)
console.log(result)
if(result == -12121212) {
  console.log('0으로 나눌수없어요')
} else {
  console.log(result)
}
