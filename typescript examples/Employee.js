"use strict";
exports.__esModule = true;
exports.Employee = void 0;
var Employee = /** @class */ (function () {
    function Employee(i, n, s) {
        this.empid = 123;
        this.empname = "ganesh";
        this.empsal = 3453.345;
        this.empid = i;
        this.empname = n;
        this.empsal = s;
    }
    Employee.prototype.display = function () {
        console.log(this.empid);
        console.log(this.empname);
        console.log(this.empsal);
    };
    return Employee;
}());
exports.Employee = Employee;
var e = new Employee(125, "abhi", 324);
e.display();
