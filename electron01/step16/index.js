"use strict"
const net = require("net")
window.$ = window.jQuery = require('jquery')
var host = $('#host'),
    port = $('#port'),
    connectBtn = $('#connectBtn'),
    closeBtn = $('#closeBtn'),
    v1 = $('#v1'),
    v2 = $('#v2'),
    op = $('#op'),
    result = $('#result')
    var value = null

closeBtn.css('display', 'none')

var socket = new net.Socket();


socket.on('connect', () => {
  connectBtn.css('display', 'none')
  closeBtn.css('display', '')
})


var buffer = ''
socket.on('data', (data) => {
  buffer += data.toString()

  while(true) {
  var newLineIndex = buffer.indexOf('\n')
  if (newLineIndex < 0)
    return

  value = buffer.substring(0, newLineIndex)
  buffer = buffer.substring(newLineIndex + 1)//초기화 시켜줌

  if (value.length > 0)
      break;
  }
  result.val(value)
  console.log('=>' + value)
})


socket.on('error', (error) => {
  alert(error.message)
})

socket.on('timeout', () => {
  alert("서버가 응답하지 않습니다")
  socket.destroy()
})
socket.on('close', () => {
  alert('끊었습니다.')
  // connectBtn.css('display', '')
  // closeBtn.css('display', 'none')
})

connectBtn.click(() => {

  socket.connect(parseInt(port.val()), host.val())
  // socket.setTimeout(500)
})

closeBtn.click(() => {
  connectBtn.css('display', '')
  closeBtn.css('display', 'none')
  socket.destroy();
  socket.end()
})

$('#send').click(() => {
  var obj = {
    v1: parseInt(v1.val()),
    v2: parseInt(v2.val()),
    op: op.val()
  }

  socket.write(JSON.stringify(obj) + '\n')

})
