//인스턴스 변수, 인스턴스 함수
//객체에서 사용되는 언어
"use strict"

function Calculator() {
  this.result = 0
//this.plus = function(value) {this.result += value}
//this.plus2 = function(a, b) {return a + b}
}
Calculator.prototype.plus = function(value) {this.result += value}

Calculator.plus2 = function(a, b) {return a + b}
//인스턴스를 사용하지 않기에 굳이 인스턴스 함수를 두는 prototype에 두는게 의미가 없고
//그런데 생성자와 관련된 함수일 경우
//함수를 객체로 활용한다

var c1 = new Calculator()

c1.plus(100)
//var r1 = c1.plus2(100, 200)
var r1 = Calculator.plus2(100, 200)
console.log(c1.result, r1)

var c2 = new Calculator()

c2.plus(200);
//var r2 = c2.plus2(1000, 2000)
var r2 = Calculator.plus2(1000, 2000)
console.log(c2.result, r2)

function Calculator() {
  this.result = 0
}

/*
Calculator.prototype.plus = function(value) {this.result += value}
-프로도타입은 인스턴스에 대해서 작업을 수행하는 함수를 두는 장소의 개념이다
-즉 인스턴스변수(this)를 사용하는 인스턴스 함수이기에 프로토타입에 저장해도된다
Calculator.prototype.plus2 = function(a, b) {return a + b}
-그러나 이 함수의 경우 인스턴스 함수는 맞으나
-인스턴스변수를 사용하지 않기에 프로토타입에 저장하지 않는다
-다만 문법적으로는 문제는 없다. 단지 의미가 맞지 않을 뿐이다.
-이 경우 글로벌 함수로 만드는 방법이있지만 글로벌 함수가 많아지다보면 기존의
-글로벌 함수를 덮어쓰는 경우도 발생할수 있어 유지보수에 안좋다
-이런 문제를 해결하기 위해 함수들을 적당하게 분류할 필요가 있다.
-함수도 객체인점을 이용하여 함수의 기능과 어울리는 이름을 부여하여 기능을 보관한다
Calculator.plus2 = function(a, b) {return a + b}
-이런형식으로

var c1 = new Calculator()
var c2 = new Calculator()
*/
