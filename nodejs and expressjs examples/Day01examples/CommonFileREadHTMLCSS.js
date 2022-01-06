const http =require('http')
const path =require('path')
const fs =require('fs')
const server =http.createServer((req,res)=>{
    //build path
    let filePath = path.join(__dirname,"public",req.url ==="/"?"index.html":req.url)
    //extension of file
    let extname = path.extname(filePath)
    //intial content type
    let contentType = "text/html";
    //check ext and content type 
    switch(extname){
        case ".js":
            contentType ="text/javascript";
            break;
        case ".css":
            contentType ="text/css";
            break;
        case ".json":
            contentType ="application/json";
             break;
        case ".png":
            contentType ="image/png";
            break;
        case ".jpg":
            contentType ="image/jpg";
            break;
        
    }
    //checking if content type is html/text 
    if(contentType == "text/html" && extname =="") filePath +=".html";
    //log the filepath
    console.log(filePath);
    //read file
    fs.readFile(filePath,(err,content)=>
    {
        if(err){
            if(err.code == "ENOENT"){
                //page not found
                fs.readFile(

                    path.join(__dirname, "public", "404.html"),
           
                    (err, content) => {
           
                      res.writeHead(404, { "Content-Type": "text/html" });
           
                      res.end(content, "utf8");
           
                    }
           
                  );
            }else {

                //  Some server error
         
                res.writeHead(500);
         
                res.end(`Server Error: ${err.code}`);
         
              }
        } else {

            // Success
       
            res.writeHead(200, { "Content-Type": contentType });
       
            res.end(content, "utf8");
       
          }
    })
})
const PORT= process.env.PORT || 5000;



server.listen(PORT,()=>console.log(`Server running on port ${PORT}`))