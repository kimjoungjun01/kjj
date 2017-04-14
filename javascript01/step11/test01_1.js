const mysql = require('mysql')

var connection = mysql.createConnection({
  //host: 'localhost',
  //port: 3306,
  database: 'webappdb',
  user: 'webapp',
  password:'1111',
})
console.log('MySQL 서버에 연결할 도구 생성완료')

connection.connect()
console.log('MySQL 서버에 연결 완료됨')

connection.end()
console.log('MySQL 서버와 연결 끊기가 예약되었음')
