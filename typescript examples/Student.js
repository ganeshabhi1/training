"use strict";
exports.__esModule = true;
exports.Student = void 0;
var Student = /** @class */ (function () {
    function Student(i, n, s) {
        this.Stuid = 123;
        this.Stuname = "ganesh";
        this.Stumarks = 99;
        this.Stuid = i;
        this.Stuname = n;
        this.Stumarks = s;
    }
    Student.prototype.display = function () {
        console.log(this.Stuid);
        console.log(this.Stuname);
        console.log(this.Stumarks);
    };
    return Student;
}());
exports.Student = Student;
var s = new Student(125, "abhi", 324);
s.display();
