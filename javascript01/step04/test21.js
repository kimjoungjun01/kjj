"use strict"

var prompt = require('prompt');

prompt.start();

inputCommand();//동기라는 듯의 변수이름

function inputCommand() {//비동기를 동기함수로 감싼다
  prompt.get(['command'], function(err, result) {
    console.log(result.command)
    inputCommand();//inputCommand 와 같은 이름을 가진 함수를 새로 실행하라
  })
}
