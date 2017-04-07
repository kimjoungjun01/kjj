'use strict'

var count = 0;

{
  let timer = setInterval(function() {
    console.log("1초 지났음")
    if (++count == 10)
      clearInterval(timer)
    }, 1000)
}
//var timer = 'ok'  // let 변수는 덮어 쓸 수 없다
//그러나 timer = 'ok' 이것은 막을수 없어서 블록을 씌운다
//블록을 씌우면 let이 블록안에서 벗어나면 변수가 존재하지않게 된다

//console.log(timer)
console.log('두 번째 타임아웃 함수를 심었다.')

//=================================
