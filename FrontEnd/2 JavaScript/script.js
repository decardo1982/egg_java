/*Arrray de objetos*/
const cart = [
    {
        title: "MacBook Pro 13'4",
        description:
            "MacBook Pro 13'4 con 8GB de RAM y 512GB de almacenamiento",
        price: 750000,
        quantity: 1,
        image: "../assets/mock1.jpg",
    },
    {
        title: "MacBook Pro 15'4",
        description:
            "MacBook Pro 15'4 con 8GB de RAM y 512GB de almacenamiento",
        price: 800000,
        quantity: 2,
        image: " ../assets/mock1.jpg",
    },
    {
        title: "Lenovo",
        description: "Lenovo 13'4 con 8GB de RAM y 256GB de almacenamiento",
        price: 75000,
        quantity: 1,
        image: " ../assets/mock1.jpg",
    },
];

/* Esta función se encarga de crear los elementos HTML 
correspondientes para cada producto en el carrito y añadirlos al contenedor del carrito en la página.*/

function populate() {
    const cartContainer = document.querySelector(".cart-container");

    if (!cartContainer) return console.log("Error");
    const productContainer = document.createElement("div");
    productContainer.classList.add("card", "products");

    cart.forEach((product) => {
        const productElement = document.createElement("article");
        productElement.classList.add("product-cart");
        const productImage = document.createElement("img");
        productImage.src = product.image;
        productImage.classList.add("productImage");
        productImage.alt = product.title;
        const productMiddle = document.createElement("div");
        productMiddle.classList.add("middle");
        const productInfo = document.createElement("div");
        productInfo.classList.add("info");
        const productTitle = document.createElement("strong");
        productTitle.classList.add("title");
        productTitle.textContent = product.title;
        const productDescription = document.createElement("span");
        productDescription.classList.add("description");
        productDescription.textContent = product.description;
        const productInput = document.createElement("input");
        productInput.type = "number";
        productInput.value = product.quantity;
        productInput.min = 1;

        productInput.addEventListener("change", (event) => {
            const value = event.target.value;
            const index = cart.findIndex(
                ({ title }) => product.title === title
            );
            if (index < 0) return console.log("Error");
            cart[index].quantity = value;
            renderTotalPrice();
        });

        const productPrice = document.createElement("strong");
        productPrice.classList.add("price");
        productPrice.textContent = `AR$ ${formatPrice(product.price)}`;

        /*Se añaden los elementos creados al producto dentro del contenedor de productos.*/

        productInfo.appendChild(productTitle);
        productInfo.appendChild(productDescription);
        productMiddle.appendChild(productInfo);
        productMiddle.appendChild(productInput);
        productElement.appendChild(productImage);
        productElement.appendChild(productMiddle);
        productElement.appendChild(productPrice);
        productContainer.appendChild(productElement);
    });
    /*Inserta el contenedor de productos en el contenedor del carrito (cartContainer) 
    al principio del mismo utilizando insertAdjacentElement().*/
    cartContainer.insertAdjacentElement("afterbegin", productContainer);
    renderTotalPrice();
}

function renderTotalPrice(cart) {
    const priceElement = document.querySelector(".resume .price");
    priceElement.textContent = formatPrice(
        cart.reduce((total, { price, quantity }) => total + price * quantity, 0)
    );
}

/*toma un precio como argumento y devuelve una representación formateada
del mismo utilizando el objeto Intl.NumberFormat para formatearlo como
moneda en el formato de Argentina (ARS).*/
function formatPrice(price) {
    return new Intl.NumberFormat("es-AR", {
        style: "currency",
        currency: "ARS",
    }).format(price);
}

/*Se añade un event listener para el evento DOMContentLoaded que
llama a la función populate() cuando el DOM esté completamente cargado.*/
document.addEventListener("DOMContentLoaded", populate);

/*------------------------------------------------------------*/
/*Este código agrega un controlador de eventos al objeto document,
que representa toda la página web. El evento en cuestión (DOMContentLoaded)
se ejecuta cuando el documento HTML inicial ha sido completamente cargado y analizado.*/

document.addEventListener("DOMContentLoaded", (event) => {
    console.log(event);
});

const form = document.querySelector("#filter-form"); // `#` es el selector CSS para los `id`.

console.log(form); // Chequeamos en la consola que no sea `null` o `undefined`. Si es el caso, verifica el `id` tanto en este archivo com en el `cart.html`.
form.addEventListener('submit', event => {
    event.preventDefault()
})

