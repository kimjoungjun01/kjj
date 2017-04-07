"use strict"
//sigma(n) 구현하기
var sum = 0;
for (var i= 1; i <= 5; i ++) {
  sum += i;
}
console.log(sum)
console.log('------------------------------------')

//재귀호출
function sigma(n) {
  if (n == 1)
    return 1;
  return n + sigma(n - 1)  //리턴하기전에 내부적으로 메모리를 새로 만들어가며 각각의 새로운변수 n 에 대입하고 계산이 끝나서야 리턴한다
}             //sigma(4) +                          //단점으로는 메모리를 새로 계속해서 만들다보면 메모리가 차고 넘쳐서 에러가 뜰수있다
                           //sigma(3) +                            //또한 실행속도가 느리고 메모리가 낭비되며 메모리를 많이 차지한다
                                         //sigma(2) +
                                                       //sigma(1) == 1  이 1값을 위 {sigma(2) + } 식에 대입하고 메모리를 삭제 한다 .

var sum2 = sigma(5)
console.log(sum2)
