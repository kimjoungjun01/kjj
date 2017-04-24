function waterMelon(n){
  var o = "수"
  var t = '박'
  var result = ""

  if (n == 0) {
    return result
  }
  for (var i = 0; i < n; i++ ) {
    if(i % 2 == 0) {
      result += o
    } else {
      result += t
    }
  }

  return result
}

// 실행을 위한 테스트코드입니다.
console.log("n이 3인 경우: "+ waterMelon(5))
console.log("n이 4인 경우: "+ waterMelon(4))
