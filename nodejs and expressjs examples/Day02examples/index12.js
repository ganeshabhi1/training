const Logger = require('./logger_demo')
const loger = new Logger()
Logger.on('message',(data)=>console.log('called listerner',data))
loger.log('hello world')