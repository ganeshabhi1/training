var http = require('http')
http.createServer(function(req,res){
    res.writeHead(200,{'Content-Type':'text/html'})
    res.write('<h1>hai iam ganesh</h1>' )
    res.end()

}).listen(8080,()=>console.log('server is running ...'))