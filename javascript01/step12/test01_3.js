const http = require('http')
const server = http.createServer(function(request, response) {
  console.log("클라이언트요청이 들어왔네");
  setTimeout(function() {
    response.end()
  }, 5000)
})

server.listen(8888)

console.log("서버 실행 중....")
