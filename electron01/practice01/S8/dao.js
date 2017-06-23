"use strict"
const mysql = require('mysql')
const connection = mysql.createConnection({
  database: 'webappdb',
  user: 'webapp',
  password: '1111'
})
connection.connect()


function selectListStudent(pageNo, successFn, errorFn) {
  connection.query(
    'select m.mno, m.name, m.tel, m.email, s.work \
    from stud s inner join memb m on s.sno=m.mno  \
    order by m.name asc \
    limit ?, ?',
    [(pageNo - 1) * 3, 3],
    function(error, results) {
      if (error) {
        errorFn(error)
      } else {
        successFn(results)
      }
  }) // connection.query()
}

function countAllStudent(successFn, errorFn) {

  connection.query(
    'select count(*) cnt from stud',
    function(error, results) {
      if (error) {
        errorFn(error)
      } else {
        successFn(results)
      }
    }) //connection.query()
}
function selectOneStudent(no, successFn, errorFn) {
  connection.query(
    'select m.mno, m.name, m.tel, m.email, s.work ,s.schl_nm \
    from stud s inner join memb m on s.sno=m.mno \
    where s.sno=?' ,
    [no],
    function(error, result) {
      if (error) {
        errorFn(error)
      } else {
        successFn(result[0])
      }
  })
}//selectOneStudent
