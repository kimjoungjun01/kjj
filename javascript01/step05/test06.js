"use strict"

function createScore(name, kor, eng, math) {
  return {
    name: name, //변수를 놓는게 아닌 변수안의 값이 놓여진다
    kor: kor,
    eng: eng,
    sum: kor + eng + math,
    aver: (kor + eng + math) / 3
  }
}
var scores2 = [
  createScore("홍길동1", 100, 100, 100), //함수를 저장하는게 아닌 함수를 호출한후 리턴값을 저장한다
  createScore("홍길동2", 90, 90, 90),
  createScore("홍길동3", 80, 80, 80),
  createScore("홍길동4", 70, 70, 70),
  createScore("홍길동5", 60, 60, 60)
]
console.log("홍길동3의 총점은?", scores2[2].sum)
console.log(scores2)
