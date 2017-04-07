'use strict'

module.exports = function() {
  let count = 0
  var no = 0
  let timer = setInterval(function() {
    ++no
    console.log(no + '초')

    if (++count == 10) {
      clearInterval(timer)
      console.log('끝')
    }
  }, 1000)
}
