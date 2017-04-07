"use strict"

function Calculator() {
  this.result = 0;
}

Calculator.prototype.plus = function(value) {this.result += value}
Calculator.prototype.minus = function(value) {this.result -= value}

Calculator.plus = function(a, b) {return a + b}
Calculator.minus = function(a, b) {return a - b}

var calc1 = new Calculator()

calc1.plus(100)
calc1.minus(20)
calc1.plus(10)

console.log(calc1.result)

var r1 = Calculator.plus(100, 200)
var r2 = Calculator.minus(100, 200)

console.log(r1, r2)


var obj = {}
console.log(Object.keys(obj).length)
