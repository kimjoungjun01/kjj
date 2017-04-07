

"use strict"

var prompt = require('prompt');

prompt.start();

inputCommand();//동기라는 듯의 변수이름

function inputCommand() {//비동기를 동기함수로 감싼다
  prompt.get(['command'], function(err, result) {
    if (result.command == 'quit') {
      console.log("안녕히 가세요!")
      return; //함수실행을 끝낸다.값이있다면 값을 주고 끝내라는 뜻
    } else if (result.command == 'list') {
      console.log('[학생목록]')
    } else if (result.command == 'add') {
      console.log('[학생입력]')
    } else if (result.command == 'delete' {
      console.log('[학생삭제]')
    }
    inputCommand();//반복하라
  })
}
