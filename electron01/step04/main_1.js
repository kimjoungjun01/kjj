

const {app, BrowserWindow} = require('electron')
const path = require('path')

let win

app.on('ready', createWindow)


function createWindow () {
  win = new BrowserWindow({width: 800, height: 600})
  win.loadURL('file:/'+ __dirname +'/index.html')
}
