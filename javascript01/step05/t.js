function createScore(name, eng, kor, math, sum, aver) {
  return {
    name: name,
    kor: kor,
    eng: eng,
    math: math,
    sum: kor + eng + math,
    aver: (kor + eng + math) / 3
  }
}

var scores2 = [
      createScore('홍길동1', 100, 100, 100),
      createScore('홍길동2', 90, 90, 90),
      createScore('홍길동3', 80, 80, 80),
      createScore('홍길동4', 70, 70, 70),
      createScore('홍길동5', 60, 60, 60)
]

console.log(scores2)

console.log("----------------------------------------------------")
//'this'를 '이 함수 안의' 라는 뜻으로 보면 쉬울듯하다
function Calculator() {
  this.result = 0
  this.plus = function(value) {this.result += value}
  this.minus = function(value) {this.result -= value}
  this.multiple = function(value) {this.result *= value}
  this.divide = function(value) {this.result /= value}
}

var calc = new Calculator()

calc.plus(10)
calc.plus(20)
calc.minus(10)
calc.multiple(70)
calc.divide(3)
console.log(calc)
console.log("----------------------------------------------------")
//자바스크립트에서는 함수도 객체이다
//var cal = new C() 여기서 오른쪽의 처리부터 다 끝내고 왼쪽이 실행되기때문에
//아직 함수가 만들어지는 중에 this 대신 cal 줘밨자 cal을 찾을수 없는 상태가 된다
//new는 {}중괄호와 같은 의미이나 연산자이기 때문에 위의 규칙을 따른다.
//즉 this 는 cal이 자기 본연의 주소를 가진다
/*
var cal = new C()
function C() {
  .result = 0
  .plus = function(value) {this.result += value},
  .minus = function(value) {this.result -= value},
  .multiple = function(value) {this.result *= value},
  .divide = function(value) {this.result /= value}
}


cal.plus(10)
cal.plus(20)
cal.minus(10)
cal.multiple(70)
cal.divide(3)
console.log(cal)
*/

console.log("----------------------------------------------------")
//calc2 { this {} }
//객체안에 객체를 만드는 방법
//배열에 배열을 추가하는것처럼 객체에 다른 객체를 추가 하는 방법
//객체의 크기를 알아보는 방법
var calc2 = new Cal
function Cal() {
  this['result'] = 0,
  this['plus'] = function(value) {this.result += value},
  this['minus'] = function(value) {this.result -= value},
  this['multiple'] = function(value) {this.result *= value},
  this['divide'] = function(value) {this.result /= value}
}

calc2['plus'](10)
console.log(calc['result'])
console.log("-------------------------------------------------------")

var k = {
  name: 'kjj',
  age: 20
}
console.log(k)
console.log("-------------------------------------------------------")
//객체 안에 객체, 그 안에 객체를 만들수 있는가, 있다면 어떻게 호출하나


function init() {
  this.result = 0
  this.plus = function(value) {this.result += value}
}


var obj = {}
  obj.f1 = 0
  obj.name = function(value) {this.f1 = 0 + value}
  //obj.name = function(value) {obj.f1 = 0 + value} 위와 같은뜻

obj.name(10)
console.log(obj.f1)
