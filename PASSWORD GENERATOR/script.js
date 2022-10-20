const generateP = document.getElementById('generate');
const passP = document.getElementById("generatedPassword");
const copyP = document.getElementById("copy");
const lenP = document.getElementById("len");
const upperP = document.getElementById("upper");
const lowerP = document.getElementById("lower");
const symbolP = document.getElementById("symbol");
const numberP = document.getElementById("number");
const upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
const lower = "abcdefghijklmnopqrstuvwxyz";
const numbers = "0123456789";
const symbol = "~!@#$%^&*()_-+=|";

function getLower() {
    return lower[Math.floor(Math.random() * lower.length)]
}

function getUpper() {
    return upper[Math.floor(Math.random() * upper.length)]
}

function getNumber() {
    return numbers[Math.floor(Math.random() * numbers.length)]
}

function getSymbol() {
    return symbol[Math.floor(Math.random() * symbol.length)]
}

function generateX() {
    const xs = [];
    if(upperP.checked){
        xs.push(getUpper())
    }
    if(lowerP.checked){
        xs.push(getLower())
    }
    if(numberP.checked){
        xs.push(getNumber())
    }
    if(symbolP.checked){
        xs.push(getSymbol())
    }
    if(xs.length === 0) return "";
    return xs[Math.floor(Math.random() * xs.length)];
}

function generatePass() {
    let password = "";
    const length = lenP.value;
    for( var i=0; i<length; i++)
    {
        const x = generateX();
        password += x;
    }
    document.getElementById("generatedPassword").innerText = password;
}

function copyPassword() {
    const copyText = document.getElementById('generatedPassword');
    navigator.clipboard.writeText(copyText.textContent);
    alert("Password successfully copied");
}