"use strict"

var obj = {}
obj.result = 10

//외부에서 값을 바꿀수 없게 하는 법
Object.defineProperty(obj, 'result2', {
  value: '100'
})
//obj에 result2 를 집어넣고 100값을 준다

console.log(obj.result)
console.log(obj.result2)
console.log("-------------------------------")

obj.result = 20
console.log(obj.result)
obj.result2 = 200
console.log(obj.result2)
