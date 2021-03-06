const http = require('http')

const url = require('url')

const server = http.createServer(function(request, response) {
  
  if (request.url == "/favicon.ico") {
    response.end();
    return
  }
  console.log("클라이언트요청이 들어왔네");

  response.writeHead(200, {
    "Content-Type" : 'text/html;charset=UTF-8'
  })

  var urlInfo = url.parse(request.url, true)
  if (urlInfo.pathname != '/hello') {
    response.end('잘못된 URL 입니다')
    return
  }


//클라이언트가 name이라는 이름으로 보낸 값을 꺼낸다
  var name = urlInfo.query.name


  console.log(request.url) //클라이언트가 원하는 자원

  response.write(name + "님 은능흐스으")

  response.end();
})

server.listen(8888)

console.log("서버 실행 중....")
