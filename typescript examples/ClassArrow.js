"use strict";
exports.__esModule = true;
exports.Employee = void 0;
var Employee = /** @class */ (function () {
    function Employee(code, name) {
        var _this = this;
        this.display = function () { console.log(_this.empCode + ' ' + _this.empName); };
        this.empCode = code;
        this.empName = name;
    }
    return Employee;
}());
exports.Employee = Employee;
var emp = new Employee(1, "ganesh");
emp.display();
