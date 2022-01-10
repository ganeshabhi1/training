var Tshirt = /** @class */ (function () {
    function Tshirt(siz, col, matr, des) {
        this.color = col;
        this.design = des;
        this.material = matr;
        this.size = siz;
    }
    Tshirt.prototype.display = function () {
        console.log("Size - " + this.size
            + "\n Material - " + this.material +
            "\n Design - " + this.design
            + "\n Color - " + this.color);
    };
    return Tshirt;
}());
var t1 = new Tshirt("small", "red", "cotton", "round-neck");
var t2 = new Tshirt("large", "yellow", "lenin", "V-neck");
var t3 = new Tshirt("xtra-large", "blue", "cotton", "round-neck");
t1.display();
t2.display();
t3.display();
