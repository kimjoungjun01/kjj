var prevalue = 0,
    aftervalue = 0,
    op = "",
    isclear = false;
var btnlist = document.querySelectorAll('.num')
var oplist = document.querySelectorAll('.op')
var equal = document.querySelectorAll('.equal')
//반복문을 이렇게 사용하라
//let을 써야 각각의 값이 출력됨
//
for (let i = 0; i < btnlist.length; i++) {
  btnlist[i].onclick = f1;
  }
}
function f1() {
  if (op ! = "" && isclear == false) {
    display.textContent = ""
    isclear = true
  }
  display.textContent += this.textContent
}
//for of 써도 결과가 같다
//e 안에 btnlist의 값을 떄려넣는다
for (var e of btnlist) {
  e.onclick = f1
}
//var를쓸 경우 i의 값은10으로 고정됨
for (var i = 0; i < btnlist.length; i++) {
  btnlist[i].onclick = f2;
  }
}
function f2() {
  v1 = parseInt(display.textContent)
}

//op
for (var e of oplist) {
  e.onclick = op
}
//op를눌렀을때 화면의 값을 정수로 저장하라
function op() {
  if (op == "") {
    prevalue = parseInt(display.textContent)
    op = this.textContent
  } else {
    var aftervalue = parseInt(display.textContent)
    switch (op) {
      case "*": prevalue *= aftervalue; break;
      case "+": prevalue += aftervalue; break;
      case "-": prevalue -= aftervalue; break;
      case "/": prevalue /= aftervalue; break;
    }
    op = this. textContent

    display.textContent = prevalue
  }
  isclear = false;
}

equal.onclick = function() {
  if (op != "") {
    var aftervalue = parseInt(display.textContent)
    switch (op) {
      case "*": prevalue *= aftervalue; break;
      case "+": prevalue += aftervalue; break;
      case "-": prevalue -= aftervalue; break;
      case "/": prevalue /= aftervalue; break;
    }
    display.textContent = prevalue
    op = ""
  } else {
    prevalue = display.textContent
  }
  isclear = false
}
