const mysql = require('mysql')

const connection = mysql.createConnection({
  database: 'webappdb',
  user: 'webapp',
  password:'1111',
})


connection.connect()

connection.query('insert into memb(name, email, tel, pwd) values(?,?,?,password(?))',
  ["오호라","test@test.com","1111-1111","1111"],
  function(error, results) {
  console.log('결과를 가져왔음')
  if (error) throw error;
  console.log(results)
})

connection.query('insert into memb(name, tel, email, pwd)' +
  'values("aaa2", "1111-1111", "aaa2@test.com",  password("1111"))', function(error, results) {
  console.log('결과를 가져왔음')
  if (error) throw error;
  console.log(results)
})


connection.end()
console.log('MySQL 서버와 연결 끊기가 예약되었음')