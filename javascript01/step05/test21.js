"use strict"

var a = 10
var b = 20
var c = 30
console.log(a, b, c)

var i = 10, j = 20, k = 30
console.log(i, j, k)

var [x, y, z] = [10, 20, 30, 40, 50]
console.log(x, y, z)


var obj = {
  name: '홍길동',
  age: 20,
  tel: '111-1111',
  email: 'test@test.com'
}

var {name, age} = obj
console.log(name, age)

var {age, email} = obj
console.log(age, email)
/*
var name = obj.name
var age = obj.age
*/
