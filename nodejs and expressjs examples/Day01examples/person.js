class person{
    constructor(name ,age)
    {
        this.name =name;
        this.age = age;
    }
    greeting(){
        console.log(`hai my name is ${this.name} and my age ${this.age}`);
    }
}
module.exports = person;