

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
  //---------------------------------------------------------------
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
    list1 = [["홍길동1", 100, 90, 80, 270, 90],
           ["홍길동2", 80, 70, 90, 240, 80],
           ["홍길동3", 60, 70, 80, 210, 70],
           ["홍길동4", 50, 60, 70, 180, 60]];
    prompt.get(['no'], function(err, result) {
      var no = parseInt(result.no)

        if (no < 10) {
          list1[no - 1] = 0
      }
      console.log(list1[no - 1][0] + "의 정보가 삭제되었습니다.")
      console.log(list1)
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
//---------------------------------------------------
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
