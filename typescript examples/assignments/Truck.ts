import { Car } from "./Car";

class Truck extends Car{
    weight:Number;
    getSalePrice(): void {
        if(this.weight >2000){
            var prc = this.regularPrice - (this.regularPrice*.1);
            console.log(prc);
        }
        else{
            var prc = this.regularPrice - (this.regularPrice*.2);
            console.log(prc);
        }
    }
}

var t1 = new Truck();
t1.weight=3000;
t1.regularPrice=5000;
t1.speed = 100;
t1.color= "white";
t1.getSalePrice();