export class Employee{
    empid:number=123
    empname:string="ganesh"
    empsal:number=3453.345
    constructor(i:number ,n:string ,s:number){
        this.empid=i
        this.empname=n
        this.empsal=s
    }
    display(){
        console.log(this.empid)
        console.log(this.empname)
        console.log(this.empsal)

    }
}
var e = new Employee(125,"abhi",324)
e.display()