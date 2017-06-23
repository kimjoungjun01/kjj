var http = require('http')

var server = http.createServer(function(request, response) {
  response.end()
})

module.exports = function() {
  return {
    listen(port, cb) {
      server.listen(port, cb)
    }
  }
}
