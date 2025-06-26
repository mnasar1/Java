// script.js

function play(userChoice) {
  const choices = ['rock', 'paper', 'scissors'];
  const roboChoice = choices[Math.floor(Math.random() * 3)];

  let result = `You chose ${userChoice}. Robo chose ${roboChoice}. `;

  if (userChoice === roboChoice) {
    result += "It's a tie!";
  } else if (
    (userChoice === 'rock' && roboChoice === 'scissors') ||
    (userChoice === 'paper' && roboChoice === 'rock') ||
    (userChoice === 'scissors' && roboChoice === 'paper')
  ) {
    result += "You win!";
  } else {
    result += "You lose!";
  }

  document.getElementById('result').innerText = result;
}
