var arr1 = new Array()
console.log(arr1)
console.log(typeof arr1)

console.log('------------------------------')

var arr2 = []
console.log(arr2)
console.log(typeof arr2)

var arr3 = ['홍길동', '임꺽정', '유관순', '안중근']
//배열의 끝에 값 추가하기
console.log('배열의 길이 = ', arr3.length)
arr3.push('윤봉길')
arr3.push('김구', '신채호')
console.log('배열의 길이 = ', arr3.length)


var value = arr3.pop()
//맨 뒤에있는 값을 꺼내어 리턴, 배열에서는 제거된다
console.log(arr3)

value = arr3.shift()
//맨 앞에있는 값을 꺼내어 리턴, 물론 배열에서 제거됨
console.log(arr3)

value = arr3.splice(2, 1)
//2번방에서 부터 1개만큼 리턴, 배열에서 제거한뒤 다음 방의 값을 앞으로 땡김
console.log(arr3)

value = arr3.splice(1,3)
//1번방에서 부터 3개만큼 리턴, 배열에서 제거한뒤 다음 방의 값을 앞으로 땡김
console.log(arr3)
console.log('-------------------------------')
