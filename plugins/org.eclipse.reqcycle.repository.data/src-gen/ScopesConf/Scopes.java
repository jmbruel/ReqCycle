/**
 */
package ScopesConf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scopes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ScopesConf.Scopes#getScopes <em>Scopes</em>}</li>
 * </ul>
 * </p>
 *
 * @see ScopesConf.ScopesConfPackage#getScopes()
 * @model
 * @generated
 */
public interface Scopes extends EObject {
	/**
	 * Returns the value of the '<em><b>Scopes</b></em>' containment reference list.
	 * The list contents are of type {@link ScopesConf.Scope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scopes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scopes</em>' containment reference list.
	 * @see ScopesConf.ScopesConfPackage#getScopes_Scopes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scope> getScopes();

} // Scopes
