class Reversearray{
    arr=[1,2,3,4];
    temp:number=this.arr.length
    
    rev(){
        for (let i = 0; i < this.temp; i++) {
           this.arr[this.temp-1]=this.arr[i]
           this.temp=this.temp-1
          }
          for (let i = 0; i < this.arr.length; i++) {
            console.log(this.arr[i])
          }
          
    }
}
var a = new Reversearray()
a.rev()