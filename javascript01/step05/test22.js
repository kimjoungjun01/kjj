"use strict"

var obj = {
  plus: function(a, b) {return a + b},
  minus: function(a, b) {return a - b},
  multiple: function(a, b) {return a * b},
  divide: function(a, b) {return a / b}
}

var obj2 = {
  plus(a, b) {return a + b},
  minus(a, b) {return a- b},
  multiple(a, b) {return a * b},
  divide(a, b) {return a / b}
}
//객체안에 함수를 넣을때 방법

console.log(obj.plus(10, 20))
console.log(obj2.plus(10, 20))
