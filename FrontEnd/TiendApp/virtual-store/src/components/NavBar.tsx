
import styles from "./NavBar.module.css"

function NavBar() {
  return <>
  
  <header className={styles.header}>
      <div className={"container"}>
        <div className="search">
          <div className="logo">
            <img src="/tiendamia-logo.svg" width="218" alt="Logo store" />
          </div>
          <div className="form">
            <form>
              <input type="text" placeholder="Search"></input>
            </form>
          </div>
          <div className="social">
            <ul>
              <li>
                <a href="https://facebook.com">
                  <img src="/facebook.png" alt="Logo social" />
                </a>
              </li>
              <li>
                <a href="https://instagram.com">
                  <img src="/instagram.png" alt="Logo social" />
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
  </>;
}

export default NavBar;
