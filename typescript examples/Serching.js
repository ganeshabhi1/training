var Serching = /** @class */ (function () {
    function Serching() {
        this.arr = [1, 2, 3, 4];
    }
    Serching.prototype.ser = function (a) {
        if (this.arr.indexOf(a) !== -1) {
            console.log("number is found");
        }
        else {
            console.log("number is not found");
        }
    };
    return Serching;
}());
var s = new Serching();
s.ser(5);
