function esPalindromo(){
    let cadena = document.getElementById("palindromo").value;
    console.log(cadena);

    const cadenaLetras = cadena.replaceAll(" ", "");
    console.log(cadenaLetras);

    const cadenaPura = cadenaLetras.toLowerCase();
    console.log(cadenaPura);

    const arrayCaracteres = cadenaPura.split("");
    console.log(arrayCaracteres);

    const arrayReverso = arrayCaracteres.reverse();
    console.log(arrayReverso);

    const cadenaReverso = arrayReverso.join("");
    console.log(cadenaReverso);

    if (cadenaPura === cadenaReverso) {
        console.log("Es palíndromo");
        alert("Es palíndromo");
    } else {
        console.log("No es palíndromo");
        alert("No es palíndromo");
    }
}