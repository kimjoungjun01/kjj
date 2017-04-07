"use strict"

function plus(a, b) {
  return a + b;
}

function minus(a, b) {
  return a - b;
}

function caller(f) {
  var value = f(20, 30);
  console.log(value);
}

caller(plus);
caller(minus);
