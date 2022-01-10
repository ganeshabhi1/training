class Greatestnumber {
    num1:number;
    num2:number;
    num3:number;

    display(){
        if(this.num1>this.num2 && this.num1>this.num3 )
        {
            console.log("greatest number is "+this.num1)

        }else if(this.num2>this.num1 && this.num2>this.num3)
        {
            console.log("greatest number is "+this.num2)
        }else{
            console.log("greatest number is "+this.num3)
        }
    }
}

var g =new Greatestnumber();
g.num1=12
g.num2=25
g.num3=89
g.display()