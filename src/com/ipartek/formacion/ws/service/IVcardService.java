package com.ipartek.formacion.ws.service;

import com.ipartek.formacion.ws.pojo.Empleado;

public interface IVcardService {

	/**
	 * Obtener la Vcard o tarjeta identificativa de un Empleado.<br>
	 * Necesitamos credenciales de administrador para poder usar este servicio
	 *
	 * @param user
	 *            Credencial de nombre de usuario
	 * @param pass
	 *            Credencial de contraseña usuario
	 * @param idEmpleado
	 *            Identificador del Empleado a obtener
	 * @return Empleado con sus datos rellenos, null en caso credenciales
	 *         incorrectas o que no exista Empleado
	 */
	Empleado getVcard(String user, String pass, long idEmpleado);

}
