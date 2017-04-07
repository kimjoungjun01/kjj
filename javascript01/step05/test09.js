"use strict"

//계산기로서 역할하도록 초기화시키기
//new 연산자를 사용하게되면 함수 안에 this라는 변수가 만들어진다
function init() {
  this.result = 0; //빈객체에 result라는 이름으로 값0을 저장한다
  //만약 이미 result라는 이름으로 저장된값이 있다면 그 값을 덮어쓴다
  this.plus = function(value) {this.result += value}
  this.minus = function(value) {this.result -= value}
  this.multiple = function(value) {this.result *= value}
  this.divide = function(value) {this.result /= value}
}
var calc = new init()
console.log(calc)
//이 계산기는 연산자 우선순위를 처리하지 않는다
//그냥 계속 계산할 뿐이다
calc.plus(10)//10
calc.plus(20)//30
calc.multiple(3)//90
calc.minus(7)//83
calc.divide(2)//41.5
console.log(calc.result)

//---------------------------------------------------
var calc2 = {
  result: 0,
  plus: function(value) {this.result += value},
  minus: function(value) {this.result -= value},
  multiple: function(value) {this.result *= value},
  divide: function(value) {this.result /= value}
}
console.log(calc2)

calc2.plus(10)
calc2.plus(20)
calc2.multiple(3)
calc2.minus(7)
calc2.divide(2)
console.log(calc2.result)
//-------------------------------------------------
//둘의 차이점
//계산기를 여러개 만들때에 차이가 보인다

var c1 = new init()
c1.plus(20)
var c2 = new init()
c2.plus(30)
var c3 = new init()
c3.plus(40)

console.log(c1.result, c2.result, c3.result)
//-------------------------------------------------------
var c4 = {
  result: 0,
  plus: function(value) {this.result += value},
  minus: function(value) {this.result -= value},
  multiple: function(value) {this.result *= value},
  divide: function(value) {this.result /= value}
}


c4.plus(200)
var c5 = {
  result: 0,
  plus: function(value) {this.result += value},
  minus: function(value) {this.result -= value},
  multiple: function(value) {this.result *= value},
  divide: function(value) {this.result /= value}
}
c5.plus(300)
var c6 = {
  result: 0,
  plus: function(value) {this.result += value},
  minus: function(value) {this.result -= value},
  multiple: function(value) {this.result *= value},
  divide: function(value) {this.result /= value}
}
c6.plus(400)

console.log(c4.result, c5.result, c6.result)
