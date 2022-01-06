const fs = require('fs')
const path = require('path')
//create a folder with asyc call back
fs.mkdir(path.join(__dirname,'/text'),{},function(err){
    if (err)throw err;
    console.log('')
})
//create and write to folder name and file name sholid not exits
fs.writeFile(path.join(__dirname,'/text','/hello.text')
,'my text file contains'
,(err)=>{
    if (err)throw err;
    console.log('file writen to')
}
)
//read file from the given path async call
fs.readFile('add.java', 'utf8', function(err, data) {
    if (err) throw err;
    console.log(data);
});

