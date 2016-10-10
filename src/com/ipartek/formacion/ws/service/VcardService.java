package com.ipartek.formacion.ws.service;

import com.ipartek.formacion.ws.pojo.Empleado;

public class VcardService implements IVcardService {

	private static final String USUARIO_NOMBRE = "admin";
	private static final String USUARIO_PASS = "admin";

	@Override
	public Empleado getVcard(String user, String pass, long idEmpleado) {
		Empleado resul = null;
		try {

			if (USUARIO_NOMBRE.equals(user) && USUARIO_PASS.equals(pass)) {
				// TODO recuperar del modelo
				resul = new Empleado();
				resul.setId(idEmpleado);
				resul.setNombre("Empleado " + idEmpleado);
				resul.setApellido("Apellido" + idEmpleado);
				resul.setTelefono("666.555.444");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return resul;
	}

}
