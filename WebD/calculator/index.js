let screen=document.getElementById("screen");
buttons=document.querySelectorAll("button");
let screenval=""

for(item of buttons){
    item.addEventListener("click",(e)=>{
        butttonText=e.target.innerText;
        console.log(butttonText)
        if(butttonText=="X"){
            butttonText="*";
            screenval+=butttonText;
            screen.value=screenval;
        }
        else if(butttonText=="=")
        {
            screen.value=eval(screenval)
            screenval=eval(screenval)
        }
        else if(butttonText=="C")
        {
            screen.value=""
            butttonText=""
            screenval=""
        }
        else
        {
            screenval+=butttonText;
            screen.value=screenval;
        }
        
    })
}