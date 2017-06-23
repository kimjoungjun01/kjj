//handlebars 사용
//템플릿 엔진 사용하기
const fs = require('fs')
const path = require('path')

var templatePath = path.join(__dirname, 'test05_3_template.txt')

fs.readFile(templatePath, 'utf8', (err, data) => {
  if(err) throw error
  console.log(data)
})
