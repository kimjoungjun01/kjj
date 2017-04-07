"use strict"

var names = ["홍길동", "임꺽정", "유관순", "한중근", "윤봉길", "김구"];

for (var index in names) {
  console.log(index);
}
console.log("------------------------------------");


var names = ["홍길동", "임꺽정", "유관순", "한중근", "윤봉길", "김구"];

for (var value of names) {
  console.log(value);
}
console.log("------------------------------------");
