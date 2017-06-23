/* 요청 정보 다루기 - Quiz 2
=> 사용자로부터 페이지 번호와 개수를 입력 받아
  학생 목록을 HTML 페이지로 출력하시오.
=> 요청 예)
  http://localhost:8888/student/list.do?pageNo=2&pageSize=3
=> 출력 예)
  간단히 테이블로 출력하라!
*/

"use strict"


/* 주석에 작성된 코드와 그 아래의 코드는 같다.
module.exports.getConnection = function() {
  return con
}
*/
const datasource = require('./datasource')
const connection = datasource.getConnection()
const memberDao = require('./member-dao')
memberDao.setConnection(connection)


const http = require('http')
const url = require('url')
const server = http.createServer(function(request, response) {
  if (request.url == '/favicon.ico') {
    response.end();
    return;
  }

  response.writeHead(200, {
    'Content-Type' : 'text/html;charset=UTF-8'
  })

  var urlInfo = url.parse(request.url, true)
  var pageNo = urlInfo.query.pageNo
  var pageSize = urlInfo.query.pageSize

  console.log('클라이언트 요청이 들어왔네!')

  var result


      connection.query(
        'select m.mno, m.name, m.tel, m.email, s.work \
        from stud s inner join memb m on s.sno=m.mno  \
        order by m.name asc \
        limit ?, ?',
        [(pageNo - 1) * 3, pageSize],
        function(error, results) {
          if (error) {

            console.log(results)
          } else {
          }
        }) // connection.query()


  response.end();
})
server.listen(8888)

console.log("서버 실행 중...")
