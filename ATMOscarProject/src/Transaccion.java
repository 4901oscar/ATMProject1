
public abstract class Transaccion {
	private int numeroCuenta;
	private Pantalla pantalla;
	private BaseDatosBanco baseDatosBanco;

	public Transaccion(int numeroCuentaUsuario, Pantalla pantallaATM, BaseDatosBanco baseDatosBancoATM) {
		numeroCuenta = numeroCuentaUsuario;
		pantalla = pantallaATM;
		baseDatosBanco = baseDatosBancoATM;
	}

	public int obtenerNumeroCuenta() {
		return numeroCuenta;
	}

	public Pantalla obtenerPantalla() {
		return pantalla;
	}

	public BaseDatosBanco obtenerBaseDatosBanco() {
		return baseDatosBanco;
	}

	abstract public void ejecutar();
}
