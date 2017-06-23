"use strict"

window.$ = window.jQuery = require('jQuery')

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

} else {
  $('.bit-new').css('display', 'none')

  var no = location.search.substring(1).split('=')[1]
  selectOneStudent(
    no,
    function(result) {
      var student = result
      fiNo.text(student.mno)
      fiEmail.val(student.email)
      fiName.val(student.name)
      fiTel.val(student.tel)
      fiSchoolName.val(student.schl_nm)
      fiWorking.attr('checked', (student.work == 'Y' ? true : false))
    },
    function(error) {
      alert('학생 데이타 가져오는 중 오류')
      throw error
    })//selectOneStudent



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
            console.log(result)
          })//stud query
      })//memb query
    })//$.click


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
