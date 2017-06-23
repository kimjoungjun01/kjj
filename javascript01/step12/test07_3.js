
const http = require('http')
const url = require('url')
const qs = require('querystring')

function get(request, response) {
  response.write('GET 요청처리 \n')
  response.write('name=' + request.query.name + '\n')
  response.write('age=' + request.query.age + '\n')
  response.write('tel=' + request.query.tel + '\n')
  response.end();
}
function post(request, response){
  var buf = ''

  request.on('data', (data)=> {
    buf += data
  })

  request.on('end', ()=> {
    var params = qs.parse(buf)
    response.write('POST 요청처리 \n')
    response.write('name=' + params.name + '\n')
    response.write('age=' + params.age + '\n')
    response.write('tel=' + params.tel + '\n')
    response.end();
  })
}
function hellow(request, response){
  response.write('해당URL을 지원하지 않습니다.')
  response.end()
}
function notfound(request, response){
  response.write('안녕하세요')
  response.end()
}

const server = http.createServer(function(request, response) {
  var urlInfo = url.parse(request.url, true)
  if(request.method == "GET"){
    request.query = urlInfo.query
  }
  response.writeHead(200, {
    'Content-Type' : 'text/plain;charset=UTF-8'
  })
  if(urlInfo.pathname == '/get.do') {
    get(request, response)
  } else if (urlInfo.pathname == '/post.do') {
    post(request, response)
  } else if (urlInfo.pathname == '/hello.do') {
    hellow(request, response)
  } else {
    notfound(request, response)
    return
  }
  })


server.listen(8888)

console.log("서버 실행 중...")
