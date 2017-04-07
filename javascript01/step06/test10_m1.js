'use strict'

var v1 = 200
console.log('test10_m1.js => v1:', v1)

global.v2 = 200
global.v3 = 300
//글로벌 변수는 다른 파일에서 사용가능
console.log('test10_m1.js => gloval.v2:', global.v2)
