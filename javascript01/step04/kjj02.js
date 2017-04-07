"use strict"

var prompt = require('prompt')
var studentList = [["가", 10, 20, 30, 60, 20],
                   ["나", 20, 30, 40, 90, 30],
                   ["다", 30, 40, 50, 120, 40],
                   ["라", 40, 50, 60, 150, 50],
                   ["마", 50, 60, 70, 180, 60]]
prompt.start();


inputCommand();

function inputCommand () {
  prompt.get(['command'], function (err, result) {
  var command = result.command;

  switch (command) {

    case "quit":
      Quit();
    return;

    case "list":
      List();
    break;

    case "add":
      Add();
    return;

    case "del":
      Del();
    return;

    default:
      Default();
  }
  inputCommand();
  })
}


function Add() {
  console.log("[학생성적추가]")
  prompt.get(['name', 'kor', 'eng', 'math'], function (err, result) {
    var student = []
      student[0] = result.name,
      student[1] = parseInt(result.kor),
      student[2] = parseInt(result.eng),
      student[3] = parseInt(result.math)
      student[4] = student[1] + student[2] + student[3]
      student[5] = student[4] / 3
    studentList[studentList.length] = student
    console.log("추가 완료")
    console.log()

    inputCommand();
  })
}

function Quit() {
    console.log("잘가요~")
}

function List() {
  console.log("[학생성적목록]")
  for (var i in studentList) {
    console.log(i + " : " + studentList[i])
  }
  console.log()
}

function Del() {
  console.log("[성적목록삭제]")
  prompt.get(['no'], function(err, result) {
    var no = parseInt(result.no);
    studentList.splice (no, 1)
    if (studentList.length == 0) {
      console.log("더이상 삭제할 수 없습니다.")
      inputCommand();
      return;
    }

    if (no < 0 || no > studentList.length) {
      console.log("삭제할 목록이 없습니다.")
      inputCommand();
      return;
    }

  /*  if (no == 'all' ) {
      for (var i = -3; i < studentList.length; i++) {
        studentList.splice (0, 1)
      }
      console.log("전부 삭제되었습니다.")
      inputCommand();
      return;
    }
    */
    console.log("삭제가 완료되었습니다.")
    inputCommand();
  })
}

function Default() {
  console.log("다시 입력해주세요")
}
