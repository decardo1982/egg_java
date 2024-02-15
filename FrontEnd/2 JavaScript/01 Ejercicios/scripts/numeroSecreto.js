// Paso 1
let codigoDescuentoSecreto = "DESCUENTO123";

// Paso 2
let intentosCodigo = 0;

// Paso 3
function verificarCodigoDescuento(codigoIngresado) {
  intentosCodigo++;

  // Comprueba si el código ingresado es correcto
  if (codigoIngresado === codigoDescuentoSecreto) {
    console.log("¡Código de descuento válido!");
    resetearIntentos();
  } else {
    console.log("Código incorrecto. Intento: " + intentosCodigo);

    // Comprueba si se han alcanzado los intentos máximos
    if (intentosCodigo >= maxIntentosCodigo) {
      console.log("Has alcanzado el número máximo de intentos. El código secreto era: " + codigoDescuentoSecreto);
      resetearIntentos();
    }
  }
}

// Función para resetear los intentos
function resetearIntentos() {
  intentosCodigo = 0;
}

// Paso 4
const maxIntentosCodigo = 5;

// Ejemplo de uso
verificarCodigoDescuento("DESCUENTO456"); // Intento 1
verificarCodigoDescuento("DESCUENTO123"); // Intento 2 (correcto)
verificarCodigoDescuento("DESCUENTO789"); // Intento 1
verificarCodigoDescuento("DESCUENTOXYZ"); // Intento 2
verificarCodigoDescuento("DESCUENTOABC"); // Intento 3
verificarCodigoDescuento("DESCUENTO123"); // Intento 4 (correcto, se reinician los intentos)
