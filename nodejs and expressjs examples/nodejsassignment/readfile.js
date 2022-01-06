const fs = require('fs')
const path = require('path')
fs.readFile('add.java', 'utf8', function(err, data) {
    if (err) throw err;
    console.log(data);
});