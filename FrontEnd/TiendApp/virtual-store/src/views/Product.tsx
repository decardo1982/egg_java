

function Product() {
  return (
    <>
      <header>
        <div className="container">
          <div className="search">
            <div className="logo">
              <img
                src="../assets/tiendamia-logo.svg"
                width="218"
                alt="Logo store"
              />
            </div>
            <div className="form">
              <form>
                <input type="text" placeholder="Search" />
              </form>
            </div>
            <div className="social">
              <ul>
                <li>
                  <a href="https://facebook.com">
                    <img src="../assets/facebook.png" alt="Logo social" />
                  </a>
                </li>
                <li>
                  <a href="https://instagram.com">
                    <img src="../assets/instagram.png" alt="Logo social" />
                  </a>
                </li>
              </ul>
            </div>
          </div>
          <div className="nav">
            <ul>
              <li>
                <a href="#">Ofertas de la semana</a>
              </li>
              <li>
                <a href="#">Cómo comprar</a>
              </li>
              <li>
                <a href="#">Costos y tarifas</a>
              </li>
              <li>
                <a href="#">Mis pedidos</a>
              </li>
              <li>
                <a href="#">Invita y gana</a>
              </li>
              <li>
                <a href="#">Garantía de Entrega</a>
              </li>
            </ul>
          </div>
        </div>
      </header>
      <main>
        <div className="container">
          <div className="columns-container">
            <div>
              <div className="product-images-block">
                <div className="thumbnail-container">
                  <img className="thumbnail" src="../assets/mock1.jpg" alt="" />
                </div>
                <div className="thumbnail-container">
                  <img className="thumbnail" src="../assets/mock2.jpg" alt="" />
                </div>
              </div>
            </div>
            <div className="thumbnail-container">
              <img id="selected-thumbnail" src="../assets/mock1.jpg" alt="" />
            </div>
            <div className="product-description-block">
              <h1 className="title" id="title">
                Apple iPhone XR,64 GB, Black - Fully Unlocked (Refurbished)
              </h1>
              <form className="selector">
                <fieldset>
                  <label className="label" htmlFor="color">
                    Color
                  </label>
                  <select>
                    <option value="" disabled selected>Selecciona un color</option>
                    <option value="a">Rojo</option>
                    <option value="a">Azul</option>
                  </select>
                </fieldset>
                <fieldset>
                  <label className="label" htmlFor="size">
                    Tamaño
                  </label>
                  <select>
                    <option value="" disabled selected>Selecciona un color</option>
                    <option value="a">Mediano</option>
                    <option value="a">Grande</option>
                  </select>
                </fieldset>
              </form>
              <div className="description">
                <span className="label">Descripción</span>
                <p id="description">
                  This phone is unlocked and compatible with any carrier of
                  choice on GSM and CDMA networks Tested htmlFor battery health
                  and guaranteed to have a minimum battery capacity of 80%.
                  Successfully passed a full diagnostic test which ensures
                  like-new functionality and removal of any prior-user personal
                  information. The device does not come with headphones or a SIM
                  card. It does include a generic (Mfi certified) charger and
                  charging cable. Inspected and guaranteed to have minimal
                  cosmetic damage, which is not noticeable when the device is
                  held at arm's length.
                </p>
                <p>
                  This phone is unlocked and compatible with any carrier of
                  choice on GSM and CDMA networks Tested htmlFor battery health
                  and guaranteed to have a minimum battery capacity of 80%.
                  Successfully passed a full diagnostic test which ensures
                  like-new functionality and removal of any prior-user personal
                  information. The device does not come with headphones or a SIM
                  card. It does include a generic (Mfi certified) charger and
                  charging cable. Inspected and guaranteed to have minimal
                  cosmetic damage, which is not noticeable when the device is
                  held at arm's length.
                </p>
              </div>
            </div>
            <div className="product-checkout-block">
              <div className="checkout-container">
                <span className="checkout-total-label">Total:</span>
                <h2 className="checkout-total-price" id="price">
                  $152.400
                </h2>
                <p className="checkout-description">
                  Incluye impuesto PAIS y percepción AFIP. Podés recuperar AR$
                  50711 haciendo la solicitud en AFIP.
                </p>
                <ul className="checkout-policy-list">
                  <li>
                    <span className="policy-icon">
                      <img src="../assets/truck.png" alt="Truck" />
                    </span>
                    <span className="policy-desc">
                      Agrega el producto al carrito para conocer los costos de
                      envío
                    </span>
                  </li>
                  <li>
                    <span className="policy-icon">
                      <img src="../assets/plane.png" alt="Plane" />
                    </span>
                    <span className="policy-desc">
                      Recibí aproximadamente entre 10 y 15 días hábiles,
                      seleccionando envío normal
                    </span>
                  </li>
                </ul>
                <div className="checkout-process">
                  <div className="top">
                    <input
                      id="input-quantity"
                      type="number"
                      value="1"
                      min="1"
                    />
                    <button className="btn-primary">Comprar</button>
                  </div>
                  <div className="bottom">
                    <button className="btn-outline" id="btn-add-to-cart">
                      Añadir al Carrito
                    </button>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div className="sales-block">
            <div className="sales-title">
              <h2>Productos relacionados</h2>
            </div>
            <div className="product-container">
              <article className="product-card">
                <img
                  className="product-img"
                  src="../assets/mock1.jpg"
                  alt="Macbook Pro"
                />
                <div className="product-info">
                  <span className="product-title">Macbook Pro 15'4</span>
                  <span className="product-description">Space Gray</span>
                  <div className="product-price-block">
                    <span className="price">$750.000</span>
                    <span className="discount">50% Off</span>
                  </div>
                  <div className="product-tax-policy">
                    Incluye impuesto País y percepción AFIP
                  </div>
                </div>
              </article>
              <article className="product-card">
                <img
                  className="product-img"
                  src="../assets/mock1.jpg"
                  alt="Macbook Pro"
                />
                <div className="product-info">
                  <span className="product-title">Macbook Pro 15'4</span>
                  <span className="product-description">Space Gray</span>
                  <div className="product-price-block">
                    <span className="price">$750.000</span>
                    <span className="discount">50% Off</span>
                  </div>
                  <div className="product-tax-policy">
                    Incluye impuesto País y percepción AFIP
                  </div>
                </div>
              </article>
              <article className="product-card">
                <img
                  className="product-img"
                  src="../assets/mock1.jpg"
                  alt="Macbook Pro"
                />
                <div className="product-info">
                  <span className="product-title">Macbook Pro 15'4</span>
                  <span className="product-description">Space Gray</span>
                  <div className="product-price-block">
                    <span className="price">$750.000</span>
                    <span className="discount">50% Off</span>
                  </div>
                  <div className="product-tax-policy">
                    Incluye impuesto País y percepción AFIP
                  </div>
                </div>
              </article>
              <article className="product-card">
                <img
                  className="product-img"
                  src="../assets/mock1.jpg"
                  alt="Macbook Pro"
                />
                <div className="product-info">
                  <span className="product-title">Macbook Pro 15'4</span>
                  <span className="product-description">Space Gray</span>
                  <div className="product-price-block">
                    <span className="price">$750.000</span>
                    <span className="discount">50% Off</span>
                  </div>
                  <div className="product-tax-policy">
                    Incluye impuesto País y percepción AFIP
                  </div>
                </div>
              </article>
            </div>
          </div>
        </div>
      </main>
      <footer>
        <div className="container">
          <div className="columns-container">
            <div className="col">
              <ul>
                <li className="col-main-item">
                  <a href="#">Ofertas de la semana</a>
                </li>
                <li>
                  <a href="#">Laptops</a>
                </li>
                <li>
                  <a href="#">Audio</a>
                </li>
                <li>
                  <a href="#">Auticulares</a>
                </li>
              </ul>
            </div>
            <div className="col">
              <ul>
                <li className="col-main-item">
                  <a href="#">Cómo comprar</a>
                </li>
                <li>
                  <a href="#">Formas de pago</a>
                </li>
                <li>
                  <a href="#">Envios</a>
                </li>
                <li>
                  <a href="#">Devoluciones</a>
                </li>
              </ul>
            </div>
            <div className="col">
              <ul>
                <li className="col-main-item">
                  <a href="#">Costos y tarifas</a>
                </li>
                <li>
                  <a href="#">Impuestos</a>
                </li>
                <li>
                  <a href="#">Facturación</a>
                </li>
              </ul>
            </div>
            <div className="col">
              <ul>
                <li className="col-main-item">
                  <a href="#">Mis pedidos</a>
                </li>
                <li>
                  <a href="#">Pedir nuevamente</a>
                </li>
                <li>
                  <a href="#">Lista de deseos</a>
                </li>
              </ul>
            </div>
            <div className="col">
              <ul>
                <li className="col-main-item">
                  <a href="#">Garantía de Entrega</a>
                </li>
              </ul>
            </div>
          </div>
          <div className="copyright">Curso de HTML + CSS 2023</div>
        </div>
      </footer>

      <script src="product.js"></script>
    </>
  );
}
export default Product;
