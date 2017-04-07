

const {app, BrowserWindow} = require('electron')

let win

//어플이 ready 상태가되면 createWindow 함수를 실행하라
app.on('ready', createWindow)

function createWindow () {
  // Create the browser window.
  win = new BrowserWindow({width: 800, height: 600})
}

//function createWindow() {
// console.log('create the Window......')
// }
