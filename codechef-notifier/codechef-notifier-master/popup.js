var bg=chrome.extension.getBackgroundPage();
var result=bg.result;
var is_busy=bg.is_result_busy;
var i=0;
var placeholder="No pending submission results";
var pholder="Lorem ipsum dolor sit amet"

function show(j){
    document.getElementById("name").innerHTML=result[j].prb;    
    document.getElementById("verdict").innerHTML=result[j].verdict;
    if(result[j].verdict==="Correct")
    {
        document.getElementById("verdict").style="color: green";
        document.getElementsByTagName("body")[0].style="background-color:#e4f0ad";        
    }
    else
    {
        document.getElementById("verdict").style="color: red";
        document.getElementsByTagName("body")[0].style="background-color:#fae6e0"        
    }
    document.getElementById("time").innerHTML=result[j].time+" s";
    document.getElementById("status_table").innerHTML=result[j].error_table;

    if(j==result.length-1)
      document.getElementById("prev").disabled=true;    
    
    if(j==0)
      document.getElementById("next").disabled=true;    
}

window.onload=function(){
    if(result.length==0)
        setDefault();
    else
    {
        show(result.length-1);
        i=result.length-1;
    }
    document.getElementById("prev").onclick=prev;
    document.getElementById("next").onclick=next;
    document.getElementById("done").onclick=done;

    if(result.length==1)
        document.getElementById("next").disabled=true;
    document.getElementById("prev").disabled=true;    
};

function next(){
    //console.log(i);
    document.getElementById("prev").disabled=false;    
    if(i!=0)
        i--;    
    show(i);
}

function prev(){
   // console.log(i);
   document.getElementById("next").disabled=false;    
    if(i!=result.length-1)
        i++;
    show(i); 
}

function done(){
    if(result.length!=0)
    {
        while(is_busy){}
        is_busy=true;
        result.splice(i,1);
        is_busy=false;
        if(i==result.length)
            i--;
        if(result.length==0)
        {
            setDefault();
            i=0;
        }
        else
            show(i);
        bg.badge--;
        if(bg.badge!=0)
           chrome.browserAction.setBadgeText({text: String(bg.badge)});
        else
           chrome.browserAction.setBadgeText({text: ""});
    }
    else
        setDefault();
}

function setDefault()
{
    document.getElementById("name").innerHTML=placeholder;
    document.getElementsByTagName("body")[0].style="background-color:#e4f0ad";  
    document.getElementById("verdict").style="color: green";
    document.getElementById("verdict").innerHTML=pholder;
    document.getElementById("time").innerHTML=pholder;
    document.getElementById("status_table").innerHTML=pholder;    

    document.getElementById("next").disabled=true;
    document.getElementById("prev").disabled=true;
    document.getElementById("done").disabled=true;
}