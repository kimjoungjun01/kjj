//에코 클라이언트 만들기
const net = require('net')

//서버 객체준비
const server = net.createServer((socket) => {
  console.log('=> 클라이언트가 연결되었습니다.')

  socket.on('data', (data) => {
    socket.write('[삥뺑뽕]' + data.toString())
    socket.destroy();
  })
})

//서버 시작
server.listen(8888, () => {
  console.log('=> 서버 실행 중....')
})
