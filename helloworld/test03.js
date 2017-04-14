function nextSqaure(n){
  var result = 0;
  for (var i = 0; i <= n; i++) {
    if (n / i == i) {
      result = (i + 1) * (i + 1)
      return result
      console.log(result)
    } else {
      result = 'no'
      console.log(result)
    }
  }

  //함수를 완성하세요

  return result;
}

// 아래는 테스트로 출력해 보기 위한 코드입니다.
console.log("결과 : " + nextSqaure(1156));
