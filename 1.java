const Hapi= require("hapi");

//initilization of server
const server=new Hapi.Server();

//add a  server connection
 server.connection({
     port:1000,
     host:'localhost'
 })
 //creating route 
 server.route({
     method:'get',
     path:'/',
     handler:(request,reply)=>{
         reply( `hello this is get method using hapi.js`)
     }
 })

// start server
server.start((err)=>{
    if (err){
        throw err;
    }
    console.log(`server started at:${server.info.uri}`);
}) 

