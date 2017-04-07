'use strict'

var count = 0

{
  let timer = setInterval(function() {
    console.log('1초')
    if (++count == 10)
      clearInterval(timer)
  }, 1000)
}
