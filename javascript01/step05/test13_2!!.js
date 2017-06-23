
"use strict"
var obj1 = {}
obj1.v1 = 100
obj1.f1 = function() {
  console.log(this.v1)
}

obj1.f1()


var obj2 = {
  v2: 200,
  f2() {
    console.log(this)//obj2 를 가르킨다.
    return function() { //객체에 저장한 함수안에서 함수를 정의하면
      // 그 함수는 따로 정의된다 즉 객체와 아무상관없으므로 this가 생성되지않는다
      console.log(this) //존재하지 않음!
      console.log('hi')
    }
  }
}



var fn = obj2.f2()
fn()
