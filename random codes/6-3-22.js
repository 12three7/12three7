// 6/3/22 variable errors.

var x = 1.5;
var y = true;
console.log(x + y); // 2.5?
console.log(x * x * x); // 3.375, oklah
console.log(y / x / x / x); //0.2962962962962963?, ok bagus

var z = false;
var a = "anjai";
console.log(z + a); // falseanjai?

var b = true;
var c = false;
console.log(b * c + b / c); // null?

var d = "anjai";
var e = true;
console.log(e * d); // null lagi 
