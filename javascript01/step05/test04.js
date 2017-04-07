"use strict"

var values = [
  "홍길동",
  100,
  3.14,
  true,
  [100, 90, 80],
  {"email": "test@test.com", "tel": "1111-1111", "age": 20},
  function(a, b) {return a + b},
  null,
  undefined,
  NaN,
  Infinity
]
console.log(values)

console.log("-------------------------")

var obj1 = {
  "v1": "홍길동",
  "v2": 100,
  "v3": 3.14,
  "v4": true,
  "v5": [100, 90, 80],
  "v6": {"email": "test@test.com", "tel": "1111-1111", "age": 20},
  "v7": function(a, b) {return a + b},
  "v8": null,
  "v9": undefined,
  "v10": NaN,
  "v11": Infinity
}
console.log(obj1)
console.log(obj1["v7"])
