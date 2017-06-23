"use strict"
const net = require("net")
window.$ = window.jQuery = require('jquery')
var host = $('#host'),
    port = $('#port'),
    alias = $('#alias'),
    message = $('#message'),
    messageBox = $('#messageBox'),
    sendBtn = $('#sendBtn')

var value = null
var myAlias = null
var socket = new net.Socket();

var buffer = ''
socket.on('data', (data) => {
  buffer += data.toString()

  while(true) {
  var newLineIndex = buffer.indexOf('\n')
  if (newLineIndex < 0)
    return

  value = buffer.substring(0, newLineIndex)
  buffer = buffer.substring(newLineIndex + 1)

  if (value.length > 0)
      break;
  }



  $('<li>').addClass(value.startsWith(myAlias) ? "me" : "him")
           .html(value)
           .appendTo(messageBox)

  messageBox.scrollTop(messageBox.prop('scrollHeight'))
})


socket.on('error', (error) => {
  alert(error.message)
})

$('#connectBtn').click(() => {
  socket.connect(parseInt(port.val()), host.val(), () => {
    socket.write(alias.val() + '\n')
    myAlias = '[' + alias.val()
  })
})

sendBtn.click(() => {
  socket.write(message.val() + '\n')
  message.val('')
})

message.keyup((e) => {
  if (e.keyCode == 13) {
    var text = message.val().replace('\n', '').replace('\r', '')
    message.val(text)
    sendBtn.click()
  }
})
