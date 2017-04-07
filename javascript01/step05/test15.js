"use strict"

function Calculator() {
  this.result = 0
}


Calculator.prototype.plus = function(value) {this.result += value}
Calculator.prototype.minus = function(value) {this.result -= value}
Calculator.prototype.divide = function(value) {this.result /= value}
Calculator.prototype.multiple = function(value) {this.result *= value}
//여기서 프로토타입은 주소를 공유한다
//즉 생성자 Calculator 객체 안에 prototype 이라는 공용객체가 있고
//그 안에 plus라는 객체가 존재하는것
//다만 객체없이는 사용할수없다.

var c1 = new Calculator()
var c2 = new Calculator()
var c3 = new Calculator()
//주소를 공유하는것은 Calculator -> prototype 안에 있는것들 뿐이므로
//result 값은 c1,c2,c3에 각각 새로 생성된다

c1.plus(10)
c2.minus(20)
c3.plus(30)

console.log(c1.result, c2.result, c3.result)
