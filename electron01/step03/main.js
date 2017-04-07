

const {app, BrowserWindow} = require('electron')
const path = require('path')

let win

//어플이 ready 상태가되면 createWindow 함수를 실행하라
app.on('ready', createWindow)

function createWindow () {
  win = new BrowserWindow({width: 800, height: 600})
  // win.loadURL('http://www.naver.com')
  win.loadURL('file:///C:/workspace/electron01/step03/index.html')
}
