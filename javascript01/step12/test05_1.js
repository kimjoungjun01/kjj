//handlebars 사용
//템플릿 엔진 사용하기

const handlebars = require('handlebars')

var str = "나는 {{name}}입니다"
var data = {
  name: '홍길동'
}

var template = handlebars.compile(str)

var result = template(data)

console.log(result)
