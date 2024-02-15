function obtenerEdad() {
  let anioNacimiento = document.getElementById("anioNacimiento").value;
  console.log(anioNacimiento);
  var anioActual = new Date().getFullYear();
  console.log(anioActual);
  let anios = anioActual - anioNacimiento;
  if (anios > 0) {
    alert("Tienes " + anios + " años.");
  } else {
    alert("Nacerás dentro de " + Math.abs(anios) + " años.");
  }
}
