'use strict'

var v1 = 100
global.v2 = 100

require('./test10_m1.js')

console.log('test10.js => v1:', v1)
console.log('test10.js => global.v2:', global.v2)
console.log('test10.js => global.v3:', global.v3)
