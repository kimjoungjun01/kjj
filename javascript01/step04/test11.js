"use strict"

function caller(f) {
  var value = f(20, 30);
  console.log(value);
}


function plus(a, b) {
  return a + b;
}
caller(plus);

var plus2 = function(a, b) {
  return a + b;
}
caller(plus2);


caller(function plus(a, b) {
  return a + b;
});

caller(function(a, b) {
  return a + b;
});

caller((a, b) => {return a + b});
caller((a, b) => a + b);
