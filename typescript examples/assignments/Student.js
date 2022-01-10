var Student = /** @class */ (function () {
    function Student(i, n, c) {
        this.stdId = i;
        this.stdName = n;
        this.stdClass = c;
    }
    Student.prototype.display = function () {
        console.log(this.stdId);
        console.log(this.stdName);
        console.log(this.stdClass);
    };
    return Student;
}());
var s1 = new Student(1, "ganesh", "cse");
var s2 = new Student(2, "abhi", "eee");
s1.display();
s2.display();
