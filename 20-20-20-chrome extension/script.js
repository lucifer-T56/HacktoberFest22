
const timer = document.getElementById('timer');

function theAlarm(){

let x = 20;
let update = setInterval(()=>{ 

 if(x>=0) {
	if(x<10) timer.innerText = `0${x}`;
	else timer.innerText = x;
	x--;

  } else{
  	 clearInterval(update);
  	  window.close();

  }

}, 1000);
}

theAlarm();


/*"content_scripts": [ 
		{
           "matches": ["<all_urls>"],
             "js":    ["script.js"]
           
	}
  ]*/