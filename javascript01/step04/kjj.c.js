

"use strict"

var prompt = require('prompt');
var list1;
list1 = [["홍길동1", 100, 90, 80, 270, 90],
         ["홍길동2", 80, 70, 90, 240, 80],
         ["홍길동3", 60, 70, 80, 210, 70],
         ["홍길동4", 50, 60, 70, 180, 60]];


prompt.start();

prompt.get(['command'], function(err, result){
  var command = result.command

    switch (result.command) {
      case "ask":
       ask();
       break;

      case "list":
       hr();
       list();
      break;

      case "add":
       hr();
       add();
      break;

      case "del":
       hr();
       del();
      break;

      case "quit":
       hr();
       quit();
      break;
    }
})

function list() {
  for (var i in list1) {

    console.log(i + " : " + list1[i])

  }
  hr();
  ask();
}
//-------------------------------------------------------------
function ask() {
  console.log("계속입력하세요");
  prompt.get(['command'], function(err, result){
    var command = result.command
    switch (command) {

      case "list":
      hr();
      list();
      break;

      case "add":
      hr();
      add();
      break;

      case "del":
      hr();
      del();
      break;

      case "quit":
      hr();
      quit();
      break;
    }
  });
}
//-------------------------------------------------------------
function add() {
  console.log("[학생 성적 입력]")
  prompt.get(['name', 'kor', 'eng', 'math'], function(err, result) {
    var list2 = [result.name,
      parseInt(result.kor),
      parseInt(result.eng),
      parseInt(result.math)];
      list2[4] = list2[1] + list2[2] + list2[3];
      list2[5] = list2[4] / 3;
      list1[list1.length] = list2;
      console.log("합계: ", list2[1] + list2[2] + list2[3])
      console.log("평균: ", list2[4] / 3)
      console.log(list2)
      hr();
      ask();
    })
  }
  //-----------------------------------------------------------------
  function hr() {
    console.log("--------------------------------")
  }
  //----------------------------------------------------------------
  function del() {
        prompt.get(['no'], function(err, result) {
          var no = result.no
          if (no == 'all') {
            for (let i = -1; i < list1.length; i++) {
              list1.splice(0, 1)
            }
          }

      list1.splice(no, 1)


      if (list1.length == 0) {
        console.log("삭제할 내용이 없습니다.")
        ask()
        return;
      }

      /*if ( no < 0 || no > list1.length) {
        console.log("존재하지 않습니다.")
        ask()
        return;
      }
*/
      console.log("삭제완료")

      hr()
      ask()
    });
  }
  //------------------------------------------------------------------
  function quit() {
    console.log("안녕히 가세요!");
  }
  function hr() {
    console.log("--------------------------------")
  }
