
  var btnAC = document.querySelector('#btnAC')
  var btnDV = document.querySelector('#btnDV')
  var btn7 = document.querySelector('#btn7')
  var btn8 = document.querySelector('#btn8')
  var btn9 = document.querySelector('#btn9')
  var btnMT = document.querySelector('#btnMT')
  var btn4 = document.querySelector('#btn4')
  var btn5 = document.querySelector('#btn5')
  var btn6 = document.querySelector('#btn6')
  var btnM = document.querySelector('#btnM')
  var btn1 = document.querySelector('#btn1')
  var btn2 = document.querySelector('#btn2')
  var btn3 = document.querySelector('#btn3')
  var btnP = document.querySelector('#btnP')
  var btnPoint = document.querySelector('#btnPoint')
  var btn0 = document.querySelector('#btn0')
  var btnEq = document.querySelector('#btnEq')
  var Sc = document.querySelector('#screen')
  var result;
  var value;
  var Op;

  btn1.addEventListener('click', function() {
    // console.log('???')
    var e = document.querySelector("#screen")
    e.innerHTML +='1'
  })
  btn2.addEventListener('click', function() {
    var e = document.querySelector("#screen")
    e.innerHTML +='2'
  })
  btn3.addEventListener('click', function() {
    var e = document.querySelector("#screen")
    e.innerHTML +='3'
  })
  btn4.addEventListener('click', function() {
    var e = document.querySelector("#screen")
    e.innerHTML +='4'
  })
  btn5.addEventListener('click', function() {
    var e = document.querySelector("#screen")
    e.innerHTML +='5'
  })
  btn6.addEventListener('click', function() {
    var e = document.querySelector("#screen")
    e.innerHTML +='6'
  })
  btn7.addEventListener('click', function() {
    var e = document.querySelector("#screen")
    e.innerHTML +='7'
  })
  btn8.addEventListener('click', function() {
    var e = document.querySelector("#screen")
    e.innerHTML +='8'
  })
  btn9.addEventListener('click', function() {
    var e = document.querySelector("#screen")
    e.innerHTML +='9'
  })
  btn0.addEventListener('click', function() {
    var e = document.querySelector("#screen")
    e.innerHTML +='0'
  })

  btnP.addEventListener('click', function() {
    var e = document.querySelector("#screen")
    e.innerHTML +='+'
  })


  btnDV.addEventListener('click', function() {
    var e = document.querySelector("#screen")
    e.innerHTML +='/'
  })
  btnM.addEventListener('click', function() {
    var e = document.querySelector("#screen")
    e.innerHTML +='-'
  })
  btnPoint.addEventListener('click', function() {
    var e = document.querySelector("#screen")
    e.innerHTML +='.'
  })
  btnMT.addEventListener('click', function() {
    var e = document.querySelector("#screen")
    e.innerHTML +='*'
  })
  btnEq.addEventListener('click', function() {
    var e = document.querySelector("#screen")
  })
  btnAC.addEventListener('click', function() {
    var e = document.querySelector("#screen")
    e.innerHTML =''
  })
