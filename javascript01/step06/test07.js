'use strict'

var m1 = require('./test07_m1.js')

//여기서 m1은 module.exports 이다
console.log(m1.plus(10, 20))
console.log(m1.minus(10, 20))
console.log(m1.multiple(10, 20))
console.log(m1.divide(10, 20))


var {plus, minus} = require('./test07_m1.js')

console.log(plus(10, 20))
console.log(minus(10, 20))
