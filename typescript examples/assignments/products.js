var products = /** @class */ (function () {
    function products() {
    }
    products.prototype.dispaly = function () {
        console.log(this.pid);
        console.log(this.pname);
        console.log((this.pprice) + this.pprice * this.pgst / 100);
    };
    return products;
}());
var p1 = new products();
p1.pid = 20;
p1.pname = "ganesh";
p1.pprice = 2000;
p1.pgst = 2;
p1.dispaly();
