/* GET 요청과 POST 요청의 데이터 다루기
=> GET 요청 데이터는 url에서 값을 꺼내면 된다.
  'url' 모듈의 분석기를 사용하여 값을 꺼낸다.
=> 테스트 하는 방법
1) test06_1.js 를 실행하여 웹서버를 가동시킨다.
2) 웹 브라우저에서 test06_1.html 파일을 로딩한다.
3) 입력폼에 값을 입력한 후 전송 버튼을 클릭한다.
4) test06_1.js의 응답 결과를 확인한다.
*/

const http = require('http')
const url = require('url')
const qs = require('querystring')

const server = http.createServer(function(request, response) {
  var urlInfo = url.parse(request.url, true)
  if(urlInfo.pathname != '/post.do') {
    response.end()
    return
  }


  var buf = ''

  request.on('data', (data)=> {
    buf += data
  })
//여기서 'data' 라는 이벤트가 끝날때까지 'end' 이벤트는 시작되지 않는다 이것이 POST 방식인것이다
//또한 'data' 이벤트는 한번만 실행되는것이 아니다. 여러번 실행된다.
//그래서 실행될때마다 그 데이터를 buf 에 저장하도록 += 연산자를 써준것이다
  request.on('end', ()=> {
    response.writeHead(200, {
      'Content-Type' : 'text/plain;charset=UTF-8'
    })

    var params = qs.parse(buf)
    response.write('name=' + params.name + '\n')
    response.write('age=' + params.age + '\n')
    response.write('tel=' + params.tel + '\n')
    response.end();
  })
})

server.listen(8888)

console.log("서버 실행 중...")
