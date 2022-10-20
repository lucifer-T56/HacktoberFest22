console.log("Welcome to Tic Tac Toe")
let music=new Audio("click.wav")
let gameovers=new Audio("gameover.wav")

let turn="X"

let gameover=false

const changeturn=()=>{

    return turn==="X"? "O":"X"
}

const checkwin=()=>{
    let boxtext=document.getElementsByClassName("boxtext");
    let wins=[
        [0,1,2],
        [3,4,5],
        [6,7,8],

        [0,3,6],
        [1,4,7],
        [2,5,8],

        [0,4,8],
        [2,4,6],
    ]
    wins.forEach(e=>{
        if((boxtext[e[0]].innerText===boxtext[e[1]].innerHTML) && (boxtext[e[2]].innerText===boxtext[e[1]].innerHTML) && (boxtext[e[0]].innerText!=="")){
            document.querySelector(".info").innerText=boxtext[e[0]].innerText+" Won"
            gameover=true
            document.querySelector(".imgbox").getElementsByTagName("img")[0].style.width="156px"
        }
    })
}

let boxes=document.getElementsByClassName("box");
Array.from(boxes).forEach(element => {
    let boxtext=element.querySelector(".boxtext")
    element.addEventListener("click",()=>{
        if (boxtext.innerText===''){
            boxtext.innerText=turn;
            music.play()
            turn=changeturn();
            checkwin();
            if (!gameover)
            {
                document.getElementsByClassName("info")[0].innerHTML="Turn for "+turn;
            }
        }
    })
});

reset.addEventListener("click",(e)=>{
    let boxtext=document.querySelectorAll(".boxtext");
    Array.from(boxtext).forEach(element=>{
        element.innerHTML="";
    })
    turn="X"
    gameover=false
    document.getElementsByClassName("info")[0].innerHTML="Turn for "+turn;
    document.querySelector(".imgbox").getElementsByTagName("img")[0].style.width="0px"
    
})
