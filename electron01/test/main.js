const{app, BrowserWindow} = require('electron')
const path = require('path')
let win

app.on('ready', createWindow)

function createWindow() {

  win = new BrowserWindow({width: 600, height: 500})
  win.loadURL(path.join('file://'+ __dirname +'/index.html'))
}
