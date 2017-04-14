const mysql = require('mysql')

const connection = mysql.createConnection({
  database: 'webappdb',
  user: 'webapp',
  password:'1111',
})
console.log('MySQL 서버에 연결할 도구 생성완료')

connection.connect()
console.log('MySQL 서버에 연결 완료됨')

connection.query('select * from memb', function(error, result) {
  console.log('결과를 가져왔음')
})


connection.end()
console.log('MySQL 서버와 연결 끊기가 예약되었음')
