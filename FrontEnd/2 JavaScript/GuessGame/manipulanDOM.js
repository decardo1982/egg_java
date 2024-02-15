const container = document.querySelector("#container");
const content = document.createElement("div");
content.classList.add("content");
content.textContent = "Este es mi nuevo contenido!";
container.appendChild(content);

const newParagraph = document.createElement("p");
newParagraph.textContent = "Hey, soy rojo!";
document.body.appendChild(newParagraph);