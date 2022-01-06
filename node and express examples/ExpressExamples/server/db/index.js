const mysql = require('mysql2')
const pool = mysql.createPool({
    connectionLimit:10,
    password:'admin@123',
    user:'root',
    database:'productdetails',
    host:'localhost',
    prot:'3306'
})
let prodb={};
prodb.all=()=>{
    return new Promise((resolve,reject)=>
    {
        pool.query('select *from product',(err,result)=>{
            if(err){
                return reject(err)
            }
            return resolve(result)
        })
    })
}