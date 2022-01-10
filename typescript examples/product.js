var product = /** @class */ (function () {
    function product() {
    }
    product.prototype.display = function () {
        console.log(this.pid);
        console.log(this.pname);
        console.log(this.price);
    };
    return product;
}());
var p = new product();
p.pid = 123;
p.pname = "ganesh";
p.price = 432.456;
p.display();
