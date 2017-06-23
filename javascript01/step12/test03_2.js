const http = require('http')
const server = http.createServer(function(request, response) {
  if (request.url == "/favicon.ico") {
    response.end();
    return
  }
  console.log("클라이언트요청이 들어왔네");
  response.writeHead(200, {
    "Content-Type" : 'text/html;charset=UTF-8'
  })


  console.log(request.url) //클라이언트가 원하는 자원

  response.write("hello, world")
  response.write("은능흐스으")
  response.end();
})

server.listen(8888)

console.log("서버 실행 중....")
