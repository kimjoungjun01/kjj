// $.get('list.json', {'pageNo': 1, 'pageSize': 4}, function(result) {
//
//   alert('서버에서 응답잉 왔다')
//   console.log(result)
// }, 'json')
//타입을 지정해준다.
//만일 지정을안해준다면 받은데이터를 파싱하여 자동으로 타입을 지정한다
//자동으로 타입지정을 할 때는 control 파일의 콘텐츠 정보를(Content-Type) 받아 지정하는것
//json 타입은 배열도 객체로 변환하여 받는다
var pageNoTag = $('#page-no')
var currPageNo = parseInt(pageNoTag.text)
var tbody = $('#student-tbl > tbody')
var prevBtn = $('#prev-btn')
var nextBtn = $('#next-btn')
var pageSize = 3

displayList(1)

function displayList(pageNo) {
  $.getJSON('list.json', {'pageNo': pageNo, 'pageSize': pageSize}, function(result) {
    var list = result.list
    var totalCount = result.totalCount
    var lastPageNo= parseInt(totalCount /pageSize) + (totalCount % pageSize > 0 ? 1 : 0)

    var template = Handlebars.compile($('#tbody-template').text())
    var generatedHTML = template(result)
    tbody.text('')
    tbody.html(generatedHTML)

    currPageNo = pageNo
    pageNoTag.text(currPageNo)
    console.log(currPageNo, lastPageNo)

    if (currPageNo == 1) {
      prevBtn.prop('disabled', true)
    } else {
      prevBtn.prop('disabled', false)
    }

    if (currPageNo == lastPageNo) {
      nextBtn.prop('disabled', true)
    } else {
      nextBtn.prop('disabled', false)
    }
  }) // getJSON
} //displayList



prevBtn.click(function() {
  displayList(currPageNo - 1)
})
nextBtn.click(function() {
  displayList(currPageNo + 1)
})
