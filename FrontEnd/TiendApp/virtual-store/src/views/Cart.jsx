
import NavBar from './nav-bar';

function Cart() {
    return(
        <>
      <NavBar />  
      <section id="hero">
      <div class="container">
        <div class="title-container">
          <span>Mi carrito</span>
        </div>
      </div>
    </section>
    <main>
      <button class="btn-primary discount" id="btn-discount">
        Aplicar 10%
      </button>
      <div class="cart-container">
        <div class="card resume">
          <div>
            <h2>Resumen del pedido</h2>
            <div class="subtotal">
              <h3>Subtotal</h3>
              <strong class="price"></strong>
            </div>
            <small>Incluye impuesto PAIS y percepción AFIP.</small>
          </div>
          <button class="btn-primary">Finaliza tu compra</button>
        </div>
      </div>
    </main>
    <footer>
      <div class="container">
        <div class="columns-container">
          <div class="col">
            <ul>
              <li class="col-main-item">
                <a href="#">Ofertas de la semana</a>
              </li>
              <li><a href="#">Laptops</a></li>
              <li><a href="#">Audio</a></li>
              <li><a href="#">Auriculares</a></li>
            </ul>
          </div>
          <div class="col">
            <ul>
              <li class="col-main-item"><a href="#">Cómo comprar</a></li>
              <li><a href="#">Formas de pago</a></li>
              <li><a href="#">Envios</a></li>
              <li><a href="#">Devoluciones</a></li>
            </ul>
          </div>
          <div class="col">
            <ul>
              <li class="col-main-item"><a href="#">Costos y tarifas</a></li>
              <li><a href="#">Impuestos</a></li>
              <li><a href="#">Facturación</a></li>
            </ul>
          </div>
          <div class="col">
            <ul>
              <li class="col-main-item"><a href="#">Mis pedidos</a></li>
              <li><a href="#">Pedir nuevamente</a></li>
              <li><a href="#">Lista de deseos</a></li>
            </ul>
          </div>
          <div class="col">
            <ul>
              <li class="col-main-item"><a href="#">Garantía de Entrega</a></li>
            </ul>
          </div>
        </div>
        <div class="copyright">Curso de HTML + CSS 2023</div>
      </div>
    </footer>
        </>
    );
}
export default Cart;