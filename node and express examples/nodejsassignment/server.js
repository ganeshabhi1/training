var http = require('http')
http.createServer(function(req,res){
    res.writeHead(200,{'Content-Type':'text/html'})
    res.write("username:"+'<input type="text"><br>' )
    res.write("password:"+'<input type="text">' )
    res.end()

}).listen(8080,()=>console.log('server is running ...'))