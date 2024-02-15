function evaluar() {
  let calificacion = document.getElementById("calificacion").value;

  if (isNaN(calificacion)) {
    alert("Ingrese un valor numérico válido");
    return;
  }

  if (calificacion >= 70 && calificacion <= 100) {
    alert("Felicidades, ¡aprobaste el examen!");
  } else if (calificacion < 70 && calificacion >= 0) {
    alert("Lo siento, no aprobaste el examen. ¡Sigue estudiando!");
  } else {
    alert("La nota no es válida, intente nuevamente!");
  }
}

function descuento() {
  let precio = document.getElementById("precio").value;
  //    let momento = (hora_actual < 12) ? "Antes del mediodía" : "Después del mediodía"
  let descuento =
    precio >= 1000 ? console.log((precio = precio * 0.9)) : console.log(precio);
}

function diaSemana() {
  let numeroDia = document.getElementById("numDia").value;
  numeroDia = parseInt(numeroDia);

  if (isNaN(numeroDia)) {
    alert("Por favor, ingresar un número válido del 1 al 7");
    return;
  }

  switch (numeroDia) {
    case 1:
      alert("Lunes");
      break;
    case 2:
      alert("Martes");
      break;
    case 3:
      alert("Miércoles");
      break;
    case 4:
      alert("Jueves");
      break;
    case 5:
      alert("Viernes");
      break;
    case 6:
      alert("Sábado");
      break;
    case 7:
      alert("Domingo");
      break;
    default:
      alert("El número debe estar entre 1 y 7");
      break;
  }
}
