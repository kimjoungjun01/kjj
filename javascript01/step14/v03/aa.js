var express = require('express')
var bodyParser = require('body-parser')
var path = require('path')

var router = express.Router()

router.get('/test.do', function(request, response) {
  response.end('aa~~~~~~~')
})

router.get('/test2.do', function(request, response) {
  response.end('dd......')
})

module.exports = router
