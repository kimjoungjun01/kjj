'use strict'
//모듈 만드는 방법!
function plus(a, b) {return a + b}
function minus(a, b) {return a - b}
function multiple(a, b) {return a * b}
function divide(a, b) {return a / b}

module.exports.plus = plus;
module.exports.minus = minus;
module.exports.multiple = multiple;
exports.divide = divide;
//module.exports 라는 지정된 객체에 원하는 함수(객체)를 보관한다
//그리고 이것은 다른파일에서 호출할수있다!
//또 module을 생략해도 된다.
