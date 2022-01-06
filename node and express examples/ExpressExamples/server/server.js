const express = require('express')
const app = express()
app.use('/products',require('./router/index'))
const PORT = process.env.PORT||4343
app.listen(PORT,()=>console.log('server started...'))