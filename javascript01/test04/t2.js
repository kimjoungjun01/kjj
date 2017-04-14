"use strict"

var bit = function(value) {
  var el = []
  if (value instanceof HTMLElement) {
    el[0] = value
  } else if (value.startsWith('<')) {
    el[0] = document.createElement(value.substr(1, value.length -2))
  }
  return el
}

var $ = bit;
