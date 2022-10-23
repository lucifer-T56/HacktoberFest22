let a;
let time;
let date;
const options = { weekday: 'long', year: 'numeric', month: 'long', day: 'numeric' };
setInterval(() => {
a = new Date();
time = (a.getHours()<10?'0':'')+a.getHours() + ":" + (a.getMinutes()<10?'0':'') + a.getMinutes() + ":" + (a.getSeconds()<10?'0':'')+a.getSeconds();
date = a.toLocaleDateString(undefined,options);
document.getElementById('time').innerHTML = time + "<br>  " + date;
}, 1000);
