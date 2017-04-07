

"use strict"
var prompt = require('prompt');

prompt.start();

prompt.get(['command'], function(err, result){
  console.log(result.command)
})
