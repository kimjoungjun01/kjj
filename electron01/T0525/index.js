"use strict"
const net = require("net")
window.$ = window.jQuery = require('jquery')
var host = $('#host'),
    port = $('#port'),
    connectBtn = $('#connectBtn'),
    closeBtn = $('#closeBtn'),
    textarea = $('#textarea'),
    text = $('#text'),
    text01 = document.querySelector('#text')

var socket = new net.Socket();





connectBtn.css('display', '')
closeBtn.css('display', 'none')

var buffer = ''
socket.on('data', (data) => {
  console.log("데이터 받음")
  buffer += data.toString()
  textarea.val(buffer)
  text01.value = ""


})
var id = "[운칠기삼]"
socket.on('connect', () => {
  socket.write(id + " 님이 입장하셨습니다" + '\n')
  connectBtn.css('display', 'none')
  closeBtn.css('display', '')
})

socket.on('timeout', () => {
  alert("서버가 응답하지 않습니다")
  socket.destroy()
})
socket.on('close', () => {
  alert('끊었습니다.')
  connectBtn.css('display', '')
  closeBtn.css('display', 'none')
})

socket.on('error', (error) => {
  alert(error.message)
})

connectBtn.click(() => {
  socket.connect(parseInt(port.val()), host.val())
  // socket.setTimeout(500)
  console.log("실행됐음")
})

closeBtn.click(() => {
  connectBtn.css('display', '')
  closeBtn.css('display', 'none')
  socket.destroy();
  socket.end()
})
function onKeyDown()
{
     if(event.keyCode == 13)
     {
       socket.write(id + " : " + text.val() + '\n')
     }
}

$('#send').click(() => {
  socket.write(id + " : " + text.val() + '\n')
})
