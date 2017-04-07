'use strict'

var count = 0;

var timer

f1()

function f1() {
  var timer = setInterval(function() {
    console.log("1초 지났음")
    if (++count == 10)
    clearInterval(timer)
  }, 1000)
}

timer = 'ok'

console.log(timer)
console.log('두 번째 타임아웃 함수를 심었다.')

//=================================
