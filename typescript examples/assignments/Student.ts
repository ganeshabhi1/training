class Student{
    stdId:number;
    stdName:string;
    stdClass:string;
    constructor(i:number,n:string,c:string){
        this.stdId=i;
        this.stdName=n;
        this.stdClass=c;
    }
    display(){
        console.log(this.stdId);
        console.log(this.stdName);
        console.log(this.stdClass);
    }
}
var s1 = new Student(1,"ganesh","cse");
var s2 = new Student(2,"abhi","eee");
s1.display();
s2.display();