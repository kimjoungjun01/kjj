
"use strict"

var age;

age = 11;

if (age < 8)
  console.log("유아");
else {
  if (age >= 8 && age <14)
    console.log("어린이");
  else
    console.log("청소년 이상입니다.");
}
console.log("---------------------------------");


age = 65;

if (age < 8)
  console.log("유아");
else
  if (age >= 8 && age <14)
    console.log("어린이");
  else
    if (age >= 14 && age < 20)
      console.log("청소년");
    else
      if (age >= 20 && age < 65)
        console.log("성인");
      else
        console.log("노인");

console.log("---------------------------------");


age = 65;

if (age < 8)
  console.log("유아");
else if (age >= 8 && age <14)
  console.log("어린이");
else if (age >= 14 && age < 20)
  console.log("청소년");
else if (age >= 20 && age < 65)
  console.log("성인");
else
  console.log("노인");

console.log("---------------------------------");

// 주의!! && 대신에 , 쓰는것은 의미가다름
age = 7;
if (age >= 8 && age <14)
 console.log("출력");//미출력

console.log("test ---------------------------------");

age = 7;
if (age >= 8, age < 14// "," 사용에 주의 "," 는 왼쪽부터 오른쪽순으로 실행 즉,
//age < 14 가 최종적으로 실행된다.
console.log("출력");// 출력
