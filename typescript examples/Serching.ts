class Serching{

    arr=[1,2,3,4];
    
    ser(a){
        if (this.arr.indexOf(a)!==-1){
            console.log("number is found")
        }
        else{
            console.log("number is not found")
        }
    }
}
var s = new Serching();
s.ser(5)