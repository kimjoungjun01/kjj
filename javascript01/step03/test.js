"use strict"
 var prompt = require('prompt');
 prompt.start();
 prompt.get(['step'], function (err, result) {
   var step = parseInt(result.step);

   for (var i = 1; i <= 9; i++)
     console.log(step + " * " + i + " = " + (step * i));
 });
