const express = require('express')
const app = express()
const path = require('path')
//use the file path of the node to get the html page loaded in to 
app.get('/',(req,res)=>
{
    //simple html page touted below 
    //res.send(<h1>welcome to express js!!!</h1>)
    res.sendFile(path.join(__dirname,'public','index.html'))

});
const port = process.env.port||9000;
app.listen(port,()=>console.log(`server started on port ${port}`))