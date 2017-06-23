//에코 클라이언트 만들기
const net = require('net')

//소켓 객체준비
const socket = new net.Socket()

//서버에 연결
socket.connect(8888, 'localhost', function() {
  console.log("=> 연결 되었음")
  socket.write('hello~\n')
  console.log("=> 서버에 데이터 보냈음")
})

//데이터를 읽었을 때 호출될 리스너 등록하기
socket.on('data', function(data) {
  console.log(data.toString())
  socket.destroy()
})

//close 이벤트가 발생했을 때 호출될 함수를 등록
//소켓을 닫으면 서버와의 연결이 끊어졌음을 알리는 'close' 이벤트가 발생한다
socket.on('close', function() {
  console.log("연결이 끊어졌음")
})
