const http = require('http')

const url = require('url')

const server = http.createServer(function(request, response) {
  if (request.url == "/favicon.ico") {
    response.end();
    return
  }
  console.log("클라이언트요청이 들어왔네");

  console.log("url=", request.url)

  var urlInfo = url.parse(request.url)
  //url 분석기 사용법
  console.log("href=", urlInfo.href)
  console.log("pathname=", urlInfo.pathname)
  console.log("search=", urlInfo.search)
  console.log("query=", urlInfo.query)

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
