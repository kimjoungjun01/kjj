
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
  var value1 = 0;
  var value2 = 0;
  var result = 0;
  var Op;

  btn1.addEventListener('click', function () {
    if(btn1.innerHTML == 1) {


      Sc.innerHTML += '1'
      value1 = value1 + '1'
      value1 = Number(value1)



      console.log(Sc.innerHTML)
      console.log(value1)
    }
  })
  btn2.addEventListener('click', function () {
    if(btn2.innerHTML == 2) {

      Sc.innerHTML += "2"
      value1 = value1
      value1 = Number(value1)

      value2 = value2 + '2'
      value2 = Number(value2)


      console.log(Sc.innerHTML)
      console.log(value1)
    }
  })
  btnP.addEventListener('click', function () {
      if (Sc.innerHTML) {
        Sc.innerHTML= ''
      }
      console.log(Sc.innerHTML)
      console.log(value1)

  })
  btnEq.addEventListener('click', function () {
      Sc.innerHTML = value1 + value2
  })
