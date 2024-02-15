document.addEventListener("click", (event) => {
  console.log(event);
  const divColor = document.getElementById("divColor").style.background;
  document.getElementById("divColor").style.background = getRandomColor();
});

function getRandomColor() {
  const letters = "0123456789ABCDEF";
  let color = "#";
  for (let i = 0; i < 6; i++) {
    color += letters[Math.floor(Math.random() * 16)];
  }
  return color;
}
