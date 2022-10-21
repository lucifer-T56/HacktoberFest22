const hourE1 = document.querySelector(".hour")
const minuteE1 = document.querySelector(".minute")
const secondE1 = document.querySelector(".second")
console.log(hourE1) ;

function updateClock() {
    const currentDate = new Date() ;
//    setTimeout(updateClock,1000) ;
    const hour = currentDate.getHours() ;
    const minute = currentDate.getMinutes() ;
    const second = currentDate.getSeconds() ;
    
    const hourDeg = (hour / 12)*360 ;
    const minuteDeg = (minute / 60)*360 ;
    const secondDeg = (second / 60)*360 ;
    hourE1.style.transform = `rotate(${hourDeg}deg)` ;
    minuteE1.style.transform = `rotate(${minuteDeg}deg)` ;
    secondE1.style.transform = `rotate(${secondDeg}deg)` ;
}

// updateClock() ;

setInterval(updateClock , 1000) ;