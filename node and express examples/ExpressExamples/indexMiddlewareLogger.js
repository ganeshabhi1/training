const express = require('express')
const app = express();
const members = require('./members')
const logger = (req,res,next)=>{
    console.log(`${req.protocol}://${req.get('host')}${req.originalurl}`)
    next();

}
//to access the middleware
app.use(logger);
//gets all members
app.get('/api/members',(req,res)=>
{
    res.json(members);
}
);
const PORT = process.env.PORT||5000
app.listen(PORT,()=>console.log('server started...'))