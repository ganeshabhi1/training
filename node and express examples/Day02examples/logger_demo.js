const EventEmitter = require('events')
//generates the rando ids
//const uuid =require('uuid')
class Logger extends EventEmitter{
    log(msg){
        //call event
        this.emit('message',{msg})
    }
}
module.exports=Logger;