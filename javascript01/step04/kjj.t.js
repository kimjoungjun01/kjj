"use strict"

var prompt = require('prompt');

prompt.start();
var studentList = [["가", 10, 10, 10, 30, 10],
                   ["나", 20, 20, 20, 60, 20],
                   ["다", 30, 30, 30, 90, 30],
                   ["라", 40, 40, 40, 120, 40],
                   ["마", 50, 50, 50, 150, 50]]
inputCommand();

function inputCommand () {
  prompt.get(['command'], function(err, result) {
    var command = result.command
    switch (command) {
      case "quit":
        console.log()
        console.log("good bye")
      return;

      case "list":
        console.log("[성적목록]")
        console.log()
        for (var i in studentList) {
          console.log(i + " : " + studentList[i])
        }
        console.log()

        inputCommand()

      return;

      case "add":
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



          inputCommand()
        })
      return;

      case "del":
        console.log("[기록삭제]")
        prompt.get(['no'], function(err, result){
          var no = parseInt(result.no)
          studentList.splice (no, 1)

          if (studentList.length == 0) {
            console.log("삭제할 목록이 존재하지 않습니다.")
            inputCommand()
            return;
          }

          if (no < 0 || no > studentList.length) {
            console.log("해당하는 항목이 없습니다.")
            inputCommand()
            return;
          }

          console.log("삭제완료")

          inputCommand()
        })
      return;

      default:
        console.log("다시 입력해 주세요")
    }

    inputCommand();
  });
}
