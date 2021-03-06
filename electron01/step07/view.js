"use strict"

window.$ = window.jQuery = require('jQuery')

const mysql = require('mysql')
const connection = mysql.createConnection({
  database: 'webappdb',
  user: 'webapp',
  password: '1111'
})
connection.connect()

/* AJAX 응용 II
=> 학생 상세 정보 출력
*/

var fiNo = $('#fi-no'),
    fiEmail = $('#fi-email'),
    fiName = $('#fi-name'),
    fiTel = $('#fi-tel'),
    fiSchoolName = $('#fi-school-name'),
    fiWorking = $('#fi-working');

if (location.search == "") {
  // 새 사용자 등록을 처리한다.
  // 상세보기와 관련된 태그는 감춘다.
  $('.bit-view').css('display', 'none')

  // 새 사용자 등록과 관련된 태그는 보이게 한다.
  $('.bit-new').css('display', '')

  // 추가 버튼에 click 이벤트 핸들러(리스너)를 등록한다.
  $('#add-btn').click(function() {
    connection.query(
      'insert into memb(name,tel,email,pwd) values(?,?,?,password(?))',
      [
       fiName.val(),
       fiTel.val(),
       fiEmail.val(),
       "1111",
      ],
      function(error, result) {
        if(error) {
          alert('회원 기본 데이터 등록 중 오류 발생')
        }
        connection.query(
          'insert into stud(sno, work, schl_nm) values(?,?,?)',
          [
          result.insertId,
          (fiWorking.prop('checked') ? 'Y' : 'N'),
          fiSchoolName.val()
          ],
          function(error, result) {
            if(error) {
              alert('회원 기본 데이터 등록 중 오류 발생')
            }
            alert('등록하였습니다.')
            location.href = 'index.html'
          })//stud query
      })//memb query
  })//cilck

} else { // 기존 사용자 정보를 가져온다.
  // 새 사용자 등록과 관련된 태그는 감춘다.
  $('.bit-new').css('display', 'none')

  // URL에서 학생 번호(no)를 추출한다.
  var no = location.search.substring(1).split('=')[1]

  // select m.mno, m.name, m.tel, m.email, s.work ,s.schl_nm\
  // from stud s inner join memb m on s.sno=m.mno\
  // where s.sno=1
  // 학생 번호를 사용하여 서버에 상세 정보를 요청한다.
  connection.query(
    'select m.mno, m.name, m.tel, m.email, s.work ,s.schl_nm \
    from stud s inner join memb m on s.sno=m.mno \
    where s.sno=?' ,
    [no],
    function(error,results) {
      console.log(results[0])
      var student = results[0]
      fiNo.text(student.mno)
      fiEmail.val(student.email)
      fiName.val(student.name)
      fiTel.val(student.tel)
      fiSchoolName.val(student.schl_nm)
      fiWorking.attr('checked', (student.work == 'Y' ? true : false))
    })//connection.query

/*
update stud set work=?, schl_nm=? where sno=?
*/

  $('#upd-btn').click(function() {
    // console.log(fiWorking.prop('checked'))
    connection.query(
      'update memb set name=?, tel=?, email=? where mno=?',
      [fiName.val(),
       fiTel.val(),
       fiEmail.val(),
       no
      ],
      function(error, result) {
        if(error) {
          alert('회원 기본 데이터 변경 중 오류 발생')
        }
        connection.query(
          'update stud set work=?, schl_nm=? where sno=?',
          [(fiWorking.prop('checked') ? 'Y' : 'N'),
          fiSchoolName.val(),
          no
          ],
          function(error, result) {
            if(error) {
              alert('회원 기본 데이터 변경 중 오류 발생')
            }
             alert('변경을 완료하였습니다')
          })//stud query
      })//memb query
    })//$.click
    var xhr = new XMLHttpRequest()
    xhr.onreadystatechange = function() {
      if (xhr.readyState < 4)
        return
      var result = JSON.parse(xhr.responseText)


    xhr.open('post', severUrl + '/webapp/student/update.json', true)
    xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded')
    xhr.send('memberNo=' + no +
            '&name=' + fiName.value +
            '&email=' + fiEmail.value +
            '&tel=' + fiTel.value +
            '&schoolName=' + fiSchoolName.value +
            '&working=' + fiWorking.checked)
    }


  $('#del-btn').click(function() {
    connection.query(
      'delete from stud where sno=?',
      [no],
      function(error, result) {
        if(error) {
          alert('회원 기본 데이터 삭제 중 오류 발생')
        }
        connection.query(
          'delete from memb where mno=?',
          [no],
          function(error, result) {
            if(error) {
              alert('회원 기본 데이터 삭제 중 오류 발생')
            }
            alert('삭제하였습니다.')
            location.href = 'index.html'
          })//memb query
      })//stud query

  })//click
}//else
$('#lst-btn').click(function() {
  location.href = "index.html"
})
