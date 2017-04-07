
//모듈의 electron이라는 이미 존재하는 객체안의 app을 가져온뒤(electron.app)
//그것을 app이라는 변수을 만들어 그안에 집어넣는다
/*
const electron = require('electron')
const app = electron.app
이는 곧 아래와 같다   ------ test21번 참조
*/
const {app} = require('electron')

//어플이 ready 상태가되면 createWindow 함수를 실행하라
app.on('ready', createWindow)

function createWindow() {
  console.log('create Window......')
}

/*
newWindowBtn.addEventListener('click', function (event) {
  const modalPath = path.join('file://', __dirname, '../../sections/windows/modal.html')
  let win = new BrowserWindow({ width: 400, height: 320 })
  win.on('close', function () { win = null })
  win.loadURL(modalPath)
  win.show()
})
*/
