"use strict";

console.log(0, Boolean(0));//false
console.log(1, Boolean(1));//true
console.log(-1, Boolean(-1));//true
console.log(120, Boolean(120));//true
console.log(Infinity, Boolean(Infinity));//true
console.log(-Infinity, Boolean(-Infinity));//true


console.log("", Boolean(""));//false
console.log(" ", Boolean(" "));
console.log("  ", Boolean("  "));
console.log("true", Boolean("true"));
console.log("false", Boolean("false"));
console.log("+", Boolean("+"));

console.log(null, Boolean(null));
console.log(undefined, Boolean(undefined));
console.log(NaN, Boolean(NaN));


console.log("----------------------------");


console.log(true, Number(true));//1
console.log(false, Number(false));//0

console.log("", Number(""));//0
console.log(" ", Number(" "));//0
console.log("  ", Number("  "));//0
console.log("   ", Number("   "));//0
console.log("12", Number("12"));//12
console.log("017", Number("017"));//17
console.log("true", Number("true"));//NaN
console.log("false", Number("false"));//NaN
console.log("hello", Number("hello"));//NaN
console.log("2500원", Number("2500원"));//NaN
console.log("$2500", Number("$2500"));//NaN
console.log("2500원", parseInt("2500원"));//2500
console.log("$2500", parseInt("$2500"));//NaN
console.log("2500$", parseInt("2500$"));//2500
console.log("200만원", parseInt("200만원"));//200


console.log(null, Number(null));
console.log(undefined, Number(undefined));
console.log(NaN, Number(NaN));



console.log("[]", Number([]));//
console.log("[10]", Number([10]));
console.log("['10']", Number(["10"]));
console.log("[10, 20]", Number("[10, 20]"));
console.log("['10', '20']", Number(["10", "20"]));
console.log("{}", Number("{}"));

console.log("-----------------------------------------------");



console.log(true, String(true));
console.log(false, String(false));

console.log(17, String(17));
//console.log(014, String(014));

console.log(null, String(null));
console.log(undefined, String(undefined));
console.log(NaN, String(NaN));
console.log("[]", String([]));
console.log("[10, 20, 30]", String([10, 20, 30]));
console.log("{}", String({}));



;
