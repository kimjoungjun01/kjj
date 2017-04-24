"use strict"

module.exports = {
  setManagerDao(dao) {
    this.managerDao = dao
  },

  setMemberDao(dao) {
    this.memberDao = dao
  },
  //
  list(pageNo, success, error) {
    var obj = this
    this.managerDao.selectList(pageNo, function(managers) {
      obj.managerDao.countAll(function(result) {
        success(managers, result[0].cnt)
      }, error)
    }, error)
  },//list()

  // detail(no, success, error) {
  //   this.managerDao.selectOne(no, success, error)
  // },//detail()
  //
  // insert(student, success, error) {
  //   var obj = this
  //   this.memberDao.insert(student, function(result) {
  //     student.no = result.insertId
  //     obj.studentDao.insert(student, success, error)
  //   }, error)
  // },//insert()
  //
  // update(student, success, error) {
  //   var obj = this
  //   this.memberDao.update(student, function(result) {
  //     obj.studentDao.update(student, success, error)
  //   }, error)
  // }, // update()
  //
  // delete(no, success, error) {
  //   var obj = this
  //   this.studentDao.delete(no, function(result) {
  //     obj.memberDao.delete(no, success, error)
  //   }, error)
  // } // delete()
} // exports
