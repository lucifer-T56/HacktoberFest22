/*
1. problem when user clicked a button then we should   give a random response of rock, paper,scissors 
2.when first one solved then we have to give result of the match and by adding by user response and computer response if user enter rock and randon generates paper then the user loses
*/

let random = Math.floor(Math.random() * 3);
const oparr = ["Rock", "Paper", "Scissors"];
let rock = $("#rock");
$("button").click((e) => {
  //diplaying what the user selected
  var userCl = e.target.name;
  $("button").css("display", "none");
  $("div#option").append("<h2></h2>");
  $("div#option h2").text(userCl);

  //creating h2 tag presenting random output
  $(".com-div").append("<h2></h2>");
  let comR = oparr[random];
  $(".com-div h2").text(comR);

  //now deciding who will win
  $("div.con").after("<p id='result'></p>");
  let p_tag = $("p#result");
  if (comR == userCl) {
    p_tag.text("Its a Draw!!");
  } else {
    switch (userCl) {
      case "Rock":
        if (comR == "Scissors") {
          p_tag.text("You Win :)");
        } else {
          p_tag.text("You Lose :(");
        }
        break;
      case "Paper":
        if (comR == "Rock") {
          p_tag.text("You Win :)");
        } else {
          p_tag.text("You Lose :(");
        }
        break;
      case "Scissors":
        if (comR == "Paper") {
          p_tag.text("You Win :)");
        } else {
          p_tag.text("You Lose :(");
        }
        break;
    }
  }
  //creating a new button so that user play the game again
  $("div.con").after("<button id='again'>Play again</button>");
  $("#again").click(() => {
    window.location.reload();
  });
});
