const fs = require('fs')
const path = require('path')
//create a folder with asyc call back
fs.mkdir(path.join(__dirname,'/training details'),{},function(err){
    if (err)throw err;
    console.log('directory created successfully')
})
//create and write to folder name and file name sholid not exits
fs.writeFile(path.join(__dirname,'/training details','/student name.text')
,'ganesh'
,(err)=>{
    if (err)throw err;
    console.log('file writen to')
}
)
fs.readFile('student name.text', 'utf8', function(err, data) {
    if (err) throw err;
    console.log(data);
});