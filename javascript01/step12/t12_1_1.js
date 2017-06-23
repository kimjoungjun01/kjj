/* 요청 정보 다루기 - Quiz 3
=> 사용자로부터 기본 회원 데이터를 입력 받아 DBMS에 저장하라!
=> 요청 예)
  http://localhost:8888/student/list.do?pageNo=1&pageSize=2
=> 출력 예)
  입력 성공입니다!

* 입력되었는지 여부는 test04_1.js 통해 확인하라!
*/

const http = require('http')
const url = require('url')
const datasource = require('./datasource')
const connection = datasource.getConnection()
const studentService = require('./student-service')

const studentDao = require('./student-dao')
studentDao.setConnection(connection)
studentService.setStudentDao(studentDao)

const server = http.createServer(function(request, response) {
  if (request.url == '/favicon.ico') {
    response.end();
    return;
  }

  var urlInfo = url.parse(request.url, true)

  if (urlInfo.pathname != '/student/list.do') {
    response.writeHead(404, {
      'Content-Type' : 'text/plain;charset=UTF-8'
    })
    response.end('잘못된 URL 입니다.')
    return
  }

  var pageNo = parseInt(urlInfo.query.pageNo)
  var pageSize = parseInt(urlInfo.query.pageSize)

  response.writeHead(200, {
    'Content-Type' : 'text/html;charset=UTF-8'
  })

  response.write(
  "<html> \
    <head> \
    <title>학생목록</title> \
    </head> \
    <body>"
  )
  response.write('<h1>학생목록</h1>')
  response.write('pageNo=' + pageNo + '<br>')
  response.write('pageSize=' + pageSize + '<br>')

  studentService.list(pageNo, pageSize,
    function(results) {
      response.write("<table border='1'> \
      <thead> \
        <tr><th>번호</th><th>이름</th><th>이메일</th><th>전화</th><th>직장인</th><th> \
      </thead> \
      <tbody> ")
      for(var r of results) {
        response.write("<tr><td>" + r.mno + "</td>")
        response.write("<td>" + r.name + "</td>")
        response.write("<td>" + r.email + "</td>")
        response.write("<td>" + r.tel + "</td>")
        response.write("<td>" + r.work + "</td></tr>")
      }
      response.write("</tbody> \
      </table>")
      response.write('</body></html>')
      response.end();
    }, function(error) {
      response.write('DB 오류!')
      response.write('</body></html>')
      response.end();
      throw error
    })
})
server.listen(8888)

console.log("서버 실행 중...")
