// Asignar el elemento correcto a la variable
const buttonElem = document.querySelector(".btn.check");
  buttonElem.addEventListener("click", () => {
    let oldText = buttonElem.innerText;
    const result = (buttonElem.innerText =
      oldText == "CHECK!" ? "OFF" : "CHECK!");
    return result;
  });

  // Seleccionar el elemento h1 por su ID
const tituloJuego = document.getElementById("tituloJuego");

// Cambiar el texto del elemento h1
tituloJuego.innerText = "JUEGO DE ADIVINAR";
