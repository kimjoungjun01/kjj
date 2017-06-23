// 학생 정보를 다루는 서비스를 정의한다.
const express = require('express')
const datasource = require('../util/datasource')

const teacherDao = require('../dao/teacher-dao')
const teacherService = require('../service/teacher-service')

const managerDao = require('../dao/manager-dao')
const managerService = require('../service/manager-service')

const lectureDao = require('../dao/lecture-dao')
const lectureService = require('../service/lecture-service')

const connection = datasource.getConnection()
teacherDao.setConnection(connection)
teacherService.setTeacherDao(teacherDao)

managerDao.setConnection(connection)
managerService.setManagerDao(managerDao)

lectureDao.setConnection(connection)
lectureService.setLectureDao(lectureDao)
// 
// classroomDao.setConnection(connection)
// classroomService.setClassroomDao(classroomDao)



const router = express.Router()

router.get('/list.do', (request, response) => {
  var pageNo = 1,
      pageSize = 3
  if (request.query.pageNo) {
    pageNo = parseInt(request.query.pageNo)
  }
  if (request.query.pageSize) {
    pageSize = parseInt(request.query.pageSize)
  }

  lectureService.list(pageNo, pageSize, function(results, totalCount) {
    var lastPageNo = parseInt(totalCount / pageSize) + (((totalCount % pageSize) > 0) ? 1 : 0)
    response.render('lecture/index',//views의 파일로 직접 찾아가서 데이타를 가져온다
        //이유? render는 템플릿엔진에게 실행을 맡기는데, app.js에서  보면 템플릿엔진의경로를
        //views로 미리 잡아줬기때문이다.
     {data: results,
      'pageNo': pageNo,
      "nextPageNo": pageNo + 1,
      "prevPageNo": pageNo - 1,
      "disabledPrevBtn": (pageNo == 1)? 'disabled' : '',
      "disabledNextBtn": (pageNo == lastPageNo)? 'disabled' : ''
    })
  }, function(error) {
    response.render('error', {'message': '강의 목록 데이터 로딩중 오류발생'})
    throw error
  })
})


router.get('/detail.do', function(request, response) {
  var no = parseInt(request.query.no)
  lectureService.detail(no, function(result) {
    response.render('lecture/view', {
      'detail': true,
      'data': result

    })
  }, function(error) {
    response.render('error', {'message': '강사 데이터 로딩중 오류발생'})
    throw error
  })
})

// router.post('/update.do', function(request, response) {
//   teacherService.update({
//     no: request.body.no,
//     name: request.body.name,
//     tel: request.body.tel,
//     email: request.body.email,
//     homepage: request.body.homepage,
//     facebook: request.body.facebook,
//     twitter: request.body.twitter,
//     password: '1111'
//   }, function(result) {
//     // 웹브라우저에게 응답 내용은 보내지 않고,
//     // 대신 list.do로 다시 요청하라고 응답한다.
//     // 그러면 웹브라우저는 list.do로 다시 요청한다.
//     response.redirect('list.do')
//
//   }, function(error) {
//     response.render('error', {
//       'message': '강사 데이터를 변경하는 중 오류가 발생했습니다.'})
//     throw error
//   })
// })
// //
// router.get("/delete.do", function(request, response) {
//   var no = parseInt(request.query.no)
//   teacherService.delete(no, function(result) {
//     response.redirect('list.do')
//   }, function(error) {
//     response.render('error', {'message': '강사 데이터 삭제중 오류입니다.'})
//     throw error
//   })
// })
//
// router.get('/form.do', function(request, response) {
//   response.render('teacher/view')
// })
// //
// //
// //
// router.post("/add.do", function(request, response) {
// console.log('ok')
//     teacherService.insert({
//       name: request.body.name,
//       tel: request.body.tel,
//       email: request.body.email,
//       homepage: request.body.homepage,
//       facebook: request.body.facebook,
//       twitter: request.body.twitter,
//       password: '1111'
//     }, function(result) {
//       // 웹브라우저에게 응답 내용은 보내지 않고,
//       // 대신 list.do로 다시 요청하라고 응답한다.
//       // 그러면 웹브라우저는 list.do로 다시 요청한다.
//       response.redirect('list.do')
//
//     }, function(error) {
//       response.render('error', {
//         'message': '학생 데이터를 추가하는 중 오류가 발생했습니다.'})
//         console.log(error)
//     })
// })

module.exports = router
