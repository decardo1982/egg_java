function calcularMoneda() {
  let cantidadDolares = document.getElementById("cantidadDolares").value;
  var tipoCambio = 1000;

  let cantidadPesos = cantidadDolares * tipoCambio;
  alert(`u$s${cantidadDolares} equivalen a $${cantidadPesos}`);
}
