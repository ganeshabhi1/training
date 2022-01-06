const express = require('express')
const app = express()
const members=[
    {

    id:1,
    name:'ganesh',
    status:'active'
    },
    {
    id:2,
    name:'abhi',
    status:'active'
    },
    {
    id:3,
    name:'ramu',
    status:'not active'

    }
    
    
];
//get all members 
app.get('/api/mem',(req,res)=>
{
    res.json(members);
}
);
const PORT = process.env.PORT||5000
app.listen(PORT,()=>console.log('server started...'))