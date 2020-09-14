/**
 */
package volley;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link volley.Persona#getNombre <em>Nombre</em>}</li>
 *   <li>{@link volley.Persona#getApellido <em>Apellido</em>}</li>
 *   <li>{@link volley.Persona#getFechaNacimiento <em>Fecha Nacimiento</em>}</li>
 *   <li>{@link volley.Persona#getSexo <em>Sexo</em>}</li>
 *   <li>{@link volley.Persona#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link volley.Persona#getDireccion <em>Direccion</em>}</li>
 *   <li>{@link volley.Persona#getCorreoElectronico <em>Correo Electronico</em>}</li>
 * </ul>
 *
 * @see volley.VolleyPackage#getPersona()
 * @model
 * @generated
 */
public interface Persona extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see volley.VolleyPackage#getPersona_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link volley.Persona#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Apellido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apellido</em>' attribute.
	 * @see #setApellido(String)
	 * @see volley.VolleyPackage#getPersona_Apellido()
	 * @model
	 * @generated
	 */
	String getApellido();

	/**
	 * Sets the value of the '{@link volley.Persona#getApellido <em>Apellido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apellido</em>' attribute.
	 * @see #getApellido()
	 * @generated
	 */
	void setApellido(String value);

	/**
	 * Returns the value of the '<em><b>Fecha Nacimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Nacimiento</em>' attribute.
	 * @see #setFechaNacimiento(Date)
	 * @see volley.VolleyPackage#getPersona_FechaNacimiento()
	 * @model
	 * @generated
	 */
	Date getFechaNacimiento();

	/**
	 * Sets the value of the '{@link volley.Persona#getFechaNacimiento <em>Fecha Nacimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Nacimiento</em>' attribute.
	 * @see #getFechaNacimiento()
	 * @generated
	 */
	void setFechaNacimiento(Date value);

	/**
	 * Returns the value of the '<em><b>Sexo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sexo</em>' attribute.
	 * @see #setSexo(String)
	 * @see volley.VolleyPackage#getPersona_Sexo()
	 * @model
	 * @generated
	 */
	String getSexo();

	/**
	 * Sets the value of the '{@link volley.Persona#getSexo <em>Sexo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sexo</em>' attribute.
	 * @see #getSexo()
	 * @generated
	 */
	void setSexo(String value);

	/**
	 * Returns the value of the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telefono</em>' attribute.
	 * @see #setTelefono(int)
	 * @see volley.VolleyPackage#getPersona_Telefono()
	 * @model
	 * @generated
	 */
	int getTelefono();

	/**
	 * Sets the value of the '{@link volley.Persona#getTelefono <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefono</em>' attribute.
	 * @see #getTelefono()
	 * @generated
	 */
	void setTelefono(int value);

	/**
	 * Returns the value of the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direccion</em>' attribute.
	 * @see #setDireccion(String)
	 * @see volley.VolleyPackage#getPersona_Direccion()
	 * @model
	 * @generated
	 */
	String getDireccion();

	/**
	 * Sets the value of the '{@link volley.Persona#getDireccion <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direccion</em>' attribute.
	 * @see #getDireccion()
	 * @generated
	 */
	void setDireccion(String value);

	/**
	 * Returns the value of the '<em><b>Correo Electronico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correo Electronico</em>' attribute.
	 * @see #setCorreoElectronico(String)
	 * @see volley.VolleyPackage#getPersona_CorreoElectronico()
	 * @model
	 * @generated
	 */
	String getCorreoElectronico();

	/**
	 * Sets the value of the '{@link volley.Persona#getCorreoElectronico <em>Correo Electronico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correo Electronico</em>' attribute.
	 * @see #getCorreoElectronico()
	 * @generated
	 */
	void setCorreoElectronico(String value);

} // Persona
