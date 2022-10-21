// const main = document.querySelector('main')
const title = document.querySelector('h4')
const text = document.querySelector('blockquote')
const dice = document.querySelector('.dice')

const url = "https://api.adviceslip.com/advice"
console.log(url)
const randomAdvice = async ()=>{
    try {
        let response = await fetch(url)
        let advice = await response.json()
        console.log(advice)
          title.textContent = 'ADVICE #'+ advice.slip.id
        text.textContent = `"${advice.slip.advice}"`  
       
    } catch (error) {
       text.textContent = `oops something went wrong. Kindly refresh page`
    }
}
randomAdvice()
dice.addEventListener("click",randomAdvice)

// dice.addEventListener('click', e =>{
//     //console.log('p')
//     e.preventDefault()
//     randomAdvice()

// })