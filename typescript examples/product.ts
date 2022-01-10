class product {
    pid:number;
    pname:string;
    price:number;

    display(){
        console.log(this.pid);
        console.log(this.pname);
        console.log(this.price);
    }
}

var p =new product();
p.pid=123;
p.pname="ganesh"
p.price=432.456
p.display()