//handlebars 사용
//템플릿 엔진 사용하기

const handlebars = require('handlebars')

var str = "{{#each students}} \
{{no}}, {{name}}, {{email}}\n \
{{/each}}"

var data = {
  students: [
    {no: 1, name: '홍길동1', email: 'test1@test.com'},
    {no: 2, name: '홍길동2', email: 'test2@test.com'},
    {no: 3, name: '홍길동3', email: 'test3@test.com'},
    {no: 4, name: '홍길동4', email: 'test4@test.com'}
  ]
}

var template = handlebars.compile(str)

var result = template(data)

console.log(result)
