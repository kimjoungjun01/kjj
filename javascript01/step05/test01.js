"use strict"
//node --use-strict 노드를 실행할때 이렇게 명령을 내려도 된다
//name = "홍길동"


var names = []
names[0] = "홍길동"
names[1] = "임꺽정"
names[2] = "유관순"
names[5] = "윤봉길"
console.log(names)
console.log(names[0])
console.log(names[1])
console.log(names[2])
console.log(names[5])
console.log("-------------------------")


var obj = {}
obj['name'] =  "홍길동"
obj['name2'] = "임꺽정"
obj.name3 = "유관순"

var v = "name4"
obj[v] = "윤봉길"

console.log(obj)
console.log(obj.name)
console.log(obj['name'])
console.log(obj["name"])
var v2 = "name"
console.log(obj[v2])

//obj.first name = "길동"  프로퍼티 명에 공백을 주지 않도록한다

obj['first name'] = '길동' //그래서 프로퍼티 명에 공백이 있을경우 이런형식으로 한다
obj['hello^^;'] = '오호라'
//console.log(obj.first nmae) 또한 물론 이런 형식으로 꺼낼수없다
console.log(obj['first name'])
console.log(obj['hello^^;'])
