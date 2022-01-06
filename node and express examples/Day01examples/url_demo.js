const url =require('url')
const myurl = new URL('http://localhost:8080/hello.html?id=100&status=active');
//host(root admin)
console.log(myurl.host);
//pathname
console.log(myurl.pathname);
//serialized query
console.log(myurl.search);
//parms object
console.log(myurl.searchParams);
//add parms
myurl.searchParams.append('note','completed')
console.log(myurl.searchParams);
