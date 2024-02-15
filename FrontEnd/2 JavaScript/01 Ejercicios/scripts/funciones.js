function saludar() {
  let nombre = document.getElementById("nombre").value;
  console.log("Hola " + nombre);
}

//Crea una función llamada calculadora que reciba dos números y una operación como parámetros.
//La función debe realizar la operación solicitada (suma, resta, multiplicación o división) y retornar el resultado.
function realizarCalculo() {
  let n1 = parseInt(document.getElementById("n1").value);
  let n2 = parseInt(document.getElementById("n2").value);
  let operacion = document.getElementById("operacion").value;

  if (isNaN(n1) || isNaN(n2)) {
    alert("Por favor, ingrese números válidos");
    return;
  }

  let resultado = calculadora(n1, n2, operacion);

  document.getElementById("resultado").innerHTML = `El resultado es ${resultado}`;
}

function calculadora(n1, n2, operacion) {
  let resultado;
  switch (operacion) {
    case "+":
      resultado = n1 + n2;
      break;
    case "-":
      resultado = n1 - n2;
      break;
    case "*":
      resultado = n1 * n2;
      break;
    case "/":
      resultado = n1 / n2;
      break;
    default:
  }
  return resultado;
}

//Escribe una función llamada contarCaracteres que reciba una cadena de texto como parámetro y retorne la cantidad de caracteres que contiene.
function contarCaracteres() {
  let palabra = document.getElementById("palabra").value;
  let cantidadLetras = palabra.length;
  alert(`La palabra "${palabra}" tiene ${cantidadLetras} letras`);
}
