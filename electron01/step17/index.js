"use strict"
const net = require("net")
window.$ = window.jQuery = require('jquery')
var host = $('#host'),
    port = $('#port'),
    v1 = $('#v1'),
    v2 = $('#v2'),
    op = $('#op'),
    result = $('#result')
    var value = null



var socket = new net.Socket();





var buffer = ''
socket.on('data', (data) => {
  buffer += data.toString()

  while(true) {
  var newLineIndex = buffer.indexOf('\n')
  if (newLineIndex < 0)
    return

  value = buffer.substring(0, newLineIndex)
  // buffer = buffer.substring(newLineIndex + 1)

  if (value.length > 0)
      break;
  }
  result.val(value)
  console.log('=>' + value)
})


socket.on('error', (error) => {
  alert(error.message)
})

$('#send').click(() => {
  var obj = {
    v1: parseInt(v1.val()),
    v2: parseInt(v2.val()),
    op: op.val()
  }

  socket.connect(parseInt(port.val()), host.val())
  socket.write(JSON.stringify(obj) + '\n')
  socket.end()

})
