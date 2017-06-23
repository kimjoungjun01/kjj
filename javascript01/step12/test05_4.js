//handlebars 사용
//템플릿 엔진 사용하기
const fs = require('fs')
const path = require('path')
const handlebars = require('handlebars')

var data = {
  name: '홍길동'
}
var templatePath = path.join(__dirname, 'test05_3_template.txt')

fs.readFile(templatePath, 'utf8', (err, src) => {
  if(err) throw error
  var template = handlebars.compile(src)
  var result = template(data)
  console.log(result)
})
