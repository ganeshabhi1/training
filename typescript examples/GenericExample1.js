function getArray12(items) {
    return new Array().concat(items);
}
var myNumArr12 = getArray12([100, 200, 300]);
var myStrArr12 = getArray12(["hello", "world"]);
myNumArr12.push(400);
myStrArr12.push("hello world");
myNumArr12.push("hi");
myStrArr12.push(400);
console.log(myStrArr12);
console.log(myNumArr12);
