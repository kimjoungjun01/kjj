//this변수의 활용 this는 언제 쓰이는가
"use strict"
/*
var obj = {}
obj.v1 = 0;
obj.f1 = function() {
v1 = 100
}
console.log(obj2)
*/

var obj ={
  v1: 0,
  f1: function() {
    //v1 = 100그냥 이렇게 하면 v1의 위치를 찾을수 없다
    this.v1 = 100//this변수의 주소와 obj주소가 같다
    //때문에 v1이 obj안에 있음을 알려주는 바와 같다.
    //즉, this대신 obj를 써도 무관하지만 this를 쓰는게 낫다.
  }
}

obj.f1()
console.log(obj.v1)

console.log("--------------------------")
