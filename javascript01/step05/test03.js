"use strict"
//주소를 저장한다
var names1 = ["홍길동", "임꺽정", "유관순"]
var names2 = names1
names1[5] = "윤봉길"
console.log(names1)
console.log(names2)
console.log("-------------------------")
//값을 저장한다
var v1 = 10
var v2 = v1 // v2 = 10 이라는 의미로 보는게 낫다
v1 = 20
console.log(v1, v2)
//값을 저장한다
v1 = true
v2 = v1
v1 = false;
console.log(v1, v2)

//문자열의 경우 v2에 v1 의 주소를 복사하여 문자열이 저장된 새주소를 저장한다
//문자열은 배열이나 객체와 달리 값을 변경할 수 없다 = immutable object
v1 = '홍길동'
v2 = v1
//v1 = '임꺽정'
var v3 = v1.replace('동', '순')// v1의 주소를 복사한뒤 복사한  새 주소의 '동'을 '순'으로 바꾼다
//즉 v1 자체의 값은 '홍길동' 그대로이다
console.log(v1, v2, v3)
console.log("-------------------------")
//주소를 저장한다
var obj1 = {"name": "홍길동", "name2": '임꺽정', 'name3': '유관순'}
var obj2 = obj1
obj2.name = "오호라"
console.log(obj1)
console.log(obj2)
