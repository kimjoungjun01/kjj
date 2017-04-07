"use strict"

var prompt = require('prompt')
var studentList = [
  ["가", 100, 100, 100, 300, 100],
  ["나", 90, 90, 90, 270, 90],
  ["다", 80, 80, 80, 240, 80],
  ["라", 70, 70, 70, 210, 70],
  ["마", 60, 60, 60, 180, 60]
]
prompt.start();

inputCommand()

function inputCommand() {
  prompt.get(['command'], function(err, result) {
    var command = result.command

    switch(command) {
      case 'quit':
        console.log("good bye")
      return;

      case 'list':
        console.log('[학생목록]')
        for (var i in studentList) {
          console.log(i + " : " + studentList[i])
        }
        console.log()
      break;

      case 'add':
        console.log("[성적입력]")
        prompt.get(['name', 'kor', 'eng', 'math'], function(err, result) {
          var student = []
            student[0] = result.name
            student[1] = parseInt(result.kor)
            student[2] = parseInt(result.eng)
            student[3] = parseInt(result.math)
            student[4] = student[1] + student[2] + student[3]
            student[5] = student[4] / 3
            studentList[studentList.length] = student
          console.log("성적입력완료")
          console.log()

          inputCommand()
      })
      return;
      case 'del':
        console.log("[기록삭제]")
        prompt.get(['no'], function(err, result) {
          var no = parseInt(result.no)
          studentList.splice(no, 1)

          if (studentList == 0) {
            console.log("삭제할 목록이 없습니다.")
            inputCommand()
            return;
          }
          if (no < 0 || no > studentList.length) {
            console.log("해당항목이 존재하지 않습니다.")
            inputCommand()
            return;
          }
          console.log(no "번 목록을 삭제하였습니다.")
          console.log()
          inputCommand()
        })
      return;
      default:
        console.log("다시입력하세요")
    }
    inputCommand()
  })
}
