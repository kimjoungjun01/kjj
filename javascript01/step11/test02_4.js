const mysql = require('mysql')

const connection = mysql.createConnection({
  database: 'webappdb',
  user: 'webapp',
  password:'1111',
})


connection.connect()


connection.query('delete from memb where name="aaa"', function(error, results) {
  console.log('결과를 가져왔음')
  if (error) throw error;
  console.log(results)
})

connection.query('delete from memb where name="aaa2"', function(error, results) {
  console.log('결과를 가져왔음')
  if (error) throw error;
  console.log(results)
})

connection.end()
console.log('MySQL 서버와 연결 끊기가 예약되었음')
