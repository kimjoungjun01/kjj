'use strict'

//비동기 방식이다
function f1() {
  console.log('1초 지났음')
}

setTimeout(f1, 1000)
console.log('첫 번째 타임아웃 함수를 심었다.')
//=================================

setTimeout(function() {
  console.log("3초 지났음")
}, 2000)
console.log('두 번째 타임아웃 함수를 심었다.')

//=================================
