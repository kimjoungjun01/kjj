const http = require('http')
const server = http.createServer(function(request, responts) {
console.log("클라이언트요청이 들어왔네");
})

server.listen(8080)

console.log("서버 실행 중....")
