const os = require(`os`);
const { compileFunction } = require("vm");
//platform
console.log(os.platform());
//cpu arch
console.log(os.arch());
//free memory
console.log(os.freemem());
//total memoer
console.log(os.totalmem());
//home directpry
console.log(os.homedir());
//uptome
console.log(os.uptime());
