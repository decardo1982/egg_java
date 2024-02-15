// Actividad Modificando Arrays.

let modArrays = () => {
    let array =  [];
    array.push(20)
    array.push(30)
    array.push(40)
    array.push(50)
    array.unshift(10)

    const div = document.querySelector("#arrayList");


    console.log("Mi array original es: ", array)

    div.innerHTML = `Mi array original es: <b>${array}</b><br><br>.`;

    let adelante = array.pop()

    console.log("El elemento que sacamos es: ", adelante)

    div.innerHTML += `El elemento que sacamos es: <b> ${adelante} </b><br><br>`;

    let atras = array.shift()

    console.log("El elemento que sacamos es: ", atras)

    div.innerHTML += `El elemento que sacamos es: <b> ${atras} </b><br><br>`;

    console.log("Mi array final es: ", array)

    div.innerHTML +=  `Mi array final es: <b> ${array} </b><br><br>`;
}

const slices = () => {

    let numeros = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100];

    const div = document.querySelector("#slices");

    let primerosTres = numeros.slice(0,3)
    
    div.innerHTML = `Los primeros tres: <b>${primerosTres}</b><br><br>`;

    let ultimosCuatro = numeros.slice(6,10)
    
    div.innerHTML += `Los ultimos cuatro: <b>${ultimosCuatro}</b><br><br>`;

    let segmentoCentral = numeros.slice(3,8)
    
    div.innerHTML += `Segmento central: <b>${segmentoCentral}</b><br><br>`;

    let segmentoSaltado = numeros.slice(1).filter((element, index) => index % 2 == 0)
    
    div.innerHTML += `Segmento salteado: <b>${segmentoSaltado}</b><br><br>`;

};
