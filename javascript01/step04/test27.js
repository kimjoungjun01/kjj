"use strict"
//꼬리재귀
function sigma(n, sum) {
  if (n == 1)
    return sum + n
  return sigma(n - 1, sum + n)//harmony 옵션을 주면 메모리를 만들지않고 기존의 메모리를 계속해서 쓴다
                              //단 이러한 꼬리 재귀 형식일 경우에만 최적화 한다(리턴값이 일정하기 때문에 가능하다)
                              //{ return n + sigma(n-1) } 이런경우는 리턴할때 자기자신(n)을 다시 호출해야 되서
}                             //리턴값이매번 달라지기 때문에 최적화자체를 할 수가없다.

var result = sigma(5, 0)

console.log(result)
//nodejs 에서는 먹히지않음 c언어에서는 자동으로 됨
//js는 콘솔에 node --harmony 를주면 됨
