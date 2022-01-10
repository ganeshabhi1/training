export class Student{
    Stuid:number=123
    Stuname:string="ganesh"
    Stumarks:number=99
    constructor(i:number ,n:string ,s:number){
        this.Stuid=i
        this.Stuname=n
        this.Stumarks=s
    }
    display(){
        console.log(this.Stuid)
        console.log(this.Stuname)
        console.log(this.Stumarks)

    }
}
var s = new Student(125,"abhi",324)
s.display()