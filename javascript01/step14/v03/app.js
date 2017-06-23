var express = require('express')
var bodyParser = require('body-parser')
var path = require('path')

var cons = require('consolidate')

// var handlebars = require('handlebars')

var app = express()

app.use(express.static('public'))
app.use(bodyParser.urlencoded({extended: false}))

// var router = require('./aa')
// app.use('/aa', router)
app.use('/aa', require('./aa')) //위와같다

app.engine('html', cons.handlebars)
app.set('view engine', 'html')// 여러개 엔진중에서 html 엔진을쓴다는 뜻
app.set('views', path.join(__dirname, '/templates'))



app.get('/test.do', function(request, response) {
  response.render('test', {name: '홍길동'})
})

app.get('/test2.do', function(request, response) {
  response.render('test2', {name: ['홍길동', '임꺽정', '유관순']})
})

app.get('/test3.do', function(request, response) {
  response.render('d/test3', {name: ['홍길동2', '임꺽정2', '유관순2']})
})

app.listen(8888, function() {
  console.log('서버가 시작되었습니다.')
})
