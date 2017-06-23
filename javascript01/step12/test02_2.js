const http = require('http')
const server = http.createServer(function(request, response) {
  console.log("클라이언트요청이 들어왔네");

  response.writeHead(200, {
    "Content-Type" : 'text/plain;charset=UTF-8'
  })

  response.write("<html> \
  <head> \
    <title>텍스트</title> \
  </head> \
  <body> \
    <h1>안녕하세요</h1> \
  </body> \
  </html>")
  response.write("hello, world")
  response.write("은능흐스으")
  response.end();
})

server.listen(8888)

console.log("서버 실행 중....")
