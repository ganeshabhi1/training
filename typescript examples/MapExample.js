var proArry=[
    {price:"100",product:"mobil"},
    {price:"200",product:"lap"},
    {price:"300",product:"mic"},
    {price:"400",product:"pc"}
];
//map example
var newpro = proArry.map(function(value){
    return value.price;
})
console.log(newPro)
//with arrow function
var newPro1 = proArry.map(value=>value.price)
console.log(newPro1)
//filter example
var filterEx = proArry.filter(function(value){
    if(value.price<300){
        return true
    }
})
console.log(filterEx)
//with arrow function
const arrowValue = proArry.filter(value=>value.price>300)
console.log(arrowValue)
//sort example
const sortProduct = proArry.sort((a,b)=>(a.product>b.product?1:-1))
console.log(sortProduct)
let data =[

];
let sum = data.reduce((acc, val)=>{

},0)
console.log(sum)