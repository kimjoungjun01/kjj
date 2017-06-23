

const {app, BrowserWindow} = require('electron')
const path = require('path')
const url = require('url')

let win

app.on('ready', createWindow)

path.win32
function createWindow () {
  win = new BrowserWindow({width: 800, height: 600})

  win.loadURL(url.format({
    protocol: 'file',
    pathname: path.join(__dirname, 'index.html'),
    slashes: true
  }))
}
