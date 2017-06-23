// 데이터 처리를 담당하는 자바스크립트
// => DAO(Data Access Object)
"use strict"

function insertMember(member, successFn, errorFn) {
  connection.query(
    'insert into memb(name,tel,email,pwd) values(?,?,?,password(?))',
    [ member.name, member.tel, member.email, member.password],
    function(error, result) {
      if (error) {
        errorFn(error)
      } else {
        successFn(result)
      }
  }) //connection.query()
} //insertStudent()


function updateMember(member, successFn, errorFn) {
  connection.query(
    'update memb set name=?, tel=?, email=? where mno=?',
    [member.name,member.tel,member.email,member.no],
    function(error, result) {
      if (error) {
        errorFn(error)
      } else {
        successFn(result)
      }
  })//connection.query()
}//updateMember


function deleteMember(member, successFn, errorFn) {
  connection.query(
    'delete from memb where mno=?',
    [member.no],
    function(error, result) {
      if (error) {
        errorFn(error)
      } else {
        successFn(result)
      }
  }) //connection.query()
}
