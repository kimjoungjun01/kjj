"use strict"
window.$ = window.jQuery = require('jquery')
var studentDao = createStudentDao(con)
var memberDao = createMemberDao(con)
var studentService = createStudentService(memberDao, studentDao)

var fiNo = $('#fi-no'),
    fiEmail = $('#fi-email'),
    fiName = $('#fi-name'),
    fiTel = $('#fi-tel'),
    fiSchoolName = $('#fi-school-name'),
    fiWorking = $('#fi-working');

if (location.search == "") {
  $('.bit-view').css('display', 'none')
  $('.bit-new').css('display', '')

  $('#add-btn').click(function() {
    studentService.insert(

      {
        name: fiName.val(),
        tel: fiTel.val(),
        email: fiEmail.val(),
        password: '1111',
        working: (fiWorking.prop('checked') ? 'Y' : 'N'),
        schoolName: fiSchoolName.val()
      },
      function() {
        location.href = 'index.html'
          console.log("뷰.js 인서트")
      },
      function(error) {

        alert('회원 등록 중 오류 발생!')
        throw error;
    }) //insertMember()
  }) // click()

} else { // 기존 사용자 정보를 가져온다.
  $('.bit-new').css('display', 'none')
  var no = location.search.substring(1).split('=')[1]

  studentService.detail(no,
    function(result) {console.log("뷰.js 디테일")
      var student = result
      fiNo.text(student.mno)
      fiEmail.val(student.email)
      fiName.val(student.name)
      fiTel.val(student.tel)
      fiSchoolName.val(student.schl_nm)
      fiWorking.attr('checked', (student.work == 'Y' ? true : false))
    },
    function(error) {
      alert('학생 데이터 가져오는 중 오류 발생!')
      throw error
  })

  $('#upd-btn').click(function() {

    studentService.update(

      {
        "no": no,
        "name": fiName.val(),
        "tel": fiTel.val(),
        "email": fiEmail.val(),
        "working": (fiWorking.prop('checked') ? 'Y' : 'N'),
        "schoolName": fiSchoolName.val()
      },
      function(result) {
        console.log("뷰.js 업뎃")
        alert('변경하였습니다.')
      },
      function(error) {
        alert('회원 기본 데이터 변경 중 오류 발생!')
        throw error;
    })//update()
  }) //click()

  $('#del-btn').click(function() {
    studentService.delete(no,
      function(result) {
        console.log("뷰.js 딜릿")
        location.href = 'index.html'
      },
      function(error) {
        alert('학생 기본 데이터 삭제 중 오류 발생!')
        throw error;
    })
  }) // click()
} // else

$('#lst-btn').click(function() {
  location.href = "index.html"
})
