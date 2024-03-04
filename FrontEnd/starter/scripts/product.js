document.addEventListener("DOMContentLoaded", ready);
function ready() {
  const thumbnails = document.querySelectorAll(".thumbnail");
  const selected = document.querySelector("#selected-thumbnail");
  if (!thumbnails || !selected) return console.log("Error");
  thumbnails.forEach((item) => {
    item.addEventListener("click", (event) => {
      selected.src = event.target.src;
    });
  });
}
