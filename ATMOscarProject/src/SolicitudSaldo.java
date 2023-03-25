
public class SolicitudSaldo extends Transaccion {

	public SolicitudSaldo(int numeroCuentaUsuario, Pantalla pantallaATM, BaseDatosBanco baseDatosBanco) {
		super(numeroCuentaUsuario, pantallaATM, baseDatosBanco);
	}

	@Override
	public void ejecutar() {

		BaseDatosBanco baseDatosBanco = obtenerBaseDatosBanco();
		Pantalla pantalla = obtenerPantalla();

		double saldoDisponible = baseDatosBanco.obtenerSaldoDisponible(obtenerNumeroCuenta());

		double saldoTotal = baseDatosBanco.obtenerSaldoTotal(obtenerNumeroCuenta());

		pantalla.mostrarLineaMensaje("\nInformacion de saldo:");
		pantalla.mostrarMensaje(" - Saldo disponible: ");
		pantalla.mostrarMonto(saldoDisponible);
		pantalla.mostrarMensaje("\n - Saldo total: ");
		pantalla.mostrarMonto(saldoTotal);
		pantalla.mostrarLineaMensaje("");
	}
}