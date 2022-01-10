var Reversearray = /** @class */ (function () {
    function Reversearray() {
        this.arr = [1, 2, 3, 4];
        this.temp = this.arr.length;
    }
    Reversearray.prototype.rev = function () {
        for (var i = 0; i < this.temp; i++) {
            this.arr[this.temp - 1] = this.arr[i];
            this.temp = this.temp - 1;
        }
        for (var i = 0; i < this.arr.length; i++) {
            console.log(this.arr[i]);
        }
    };
    return Reversearray;
}());
var a = new Reversearray();
a.rev();
