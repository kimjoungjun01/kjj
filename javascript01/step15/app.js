/* Express 프레임워크 적용
*/
var express = require('express')
var bodyParser = require('body-parser')
var path = require('path')
var cons = require('consolidate');

var app = express()
app.use(express.static('public'))
//퍼블릭은 정적자원으로 데이터를 가져와서 웹브라우저에서 직접 실행하는 자원들을 말함
//템플릿 엔진을 쓰지않는 파일들은 정적자원으로 보면된다.
//예를들면 views 안에 index.html파일은 그저 html 파일이라 정적자원으로, public 에 놔두어도 되고
//views안의 student 의 index.html은
app.use(bodyParser.urlencoded({extended: false}))

app.engine('hbs', cons.handlebars)
//html 은 확장자명을 의미하여 아무거나 지정할수 없다
//handlebars는 템플릿 엔진으로 템플릿을 만들기위해 필요한 모듈
//즉 views 폴더안의 파일을 사용하기 위함
app.set('view engine', 'hbs')
//view engine 은 프로퍼티명임 다른걸로 바꾸면 에러남
//여러 엔진중에서 html 확장자명의 엔진을 실행한다
app.set('views', path.join(__dirname, '/views'))
//요거 질문 주석으로 막아도 실행에 에러가 없음
//이유를 알았음
//폴더명이 view이거나 views일 경우에 '자동으로' 실행된다

//의미를 보자면 views는 프로퍼티명으로, 템플릿을 사용하기위해서 넣어줘야되는 지정된 것이고
//--dirname 은 현재 경로이며 path.join으로 현재경로에 /views를 이어주는 것
//아래 app.get에서 index를 실행할때 view경로를 지정해주지 않아도되는 이유이다.

// 서비스 라우터를 등록한다.
app.use('/student', require('./control/student-control'))
// use에서 /student 는 url 이며 주소를 받았을때 ./control/student-control 파일을 실행한다.
//또한 get,post 와 같이 url을 받아 콜백함수안의 기능을 탑재한다.
//여기선 ./control/student-control 안의 router 기능을 탑재하면서 실행까지 시킬것이다.
app.use('/teacher', require('./control/teacher-control'))
app.use('/lecture', require('./control/lecture-control'))

app.get('/', function(request, response) {
  response.render('index')
})
// get은 url 을 받아 뒤의 함수를 실행한다(콜백 함수)
// 실행하되 요청방식이 get방식 일때에만 실행된다

app.listen(8888, function() {
  console.log('서버가 시작되었습니다.')
})
