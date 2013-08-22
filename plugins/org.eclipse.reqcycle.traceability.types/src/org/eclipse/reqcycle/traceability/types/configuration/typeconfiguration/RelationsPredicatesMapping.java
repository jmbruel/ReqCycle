/**
 */
package org.eclipse.reqcycle.traceability.types.configuration.typeconfiguration;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.reqcycle.predicates.core.api.IPredicate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relations Predicates Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.reqcycle.traceability.types.configuration.typeconfiguration.RelationsPredicatesMapping#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.eclipse.reqcycle.traceability.types.configuration.typeconfiguration.RelationsPredicatesMapping#getDecorations <em>Decorations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.reqcycle.traceability.types.configuration.typeconfiguration.TypeconfigurationPackage#getRelationsPredicatesMapping()
 * @model
 * @generated
 */
public interface RelationsPredicatesMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' reference.
	 * @see #setRelation(Relation)
	 * @see org.eclipse.reqcycle.traceability.types.configuration.typeconfiguration.TypeconfigurationPackage#getRelationsPredicatesMapping_Relation()
	 * @model
	 * @generated
	 */
	Relation getRelation();

	/**
	 * Sets the value of the '{@link org.eclipse.reqcycle.traceability.types.configuration.typeconfiguration.RelationsPredicatesMapping#getRelation <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(Relation value);

	/**
	 * Returns the value of the '<em><b>Decorations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.reqcycle.traceability.types.configuration.typeconfiguration.DecorationPredicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decorations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decorations</em>' containment reference list.
	 * @see org.eclipse.reqcycle.traceability.types.configuration.typeconfiguration.TypeconfigurationPackage#getRelationsPredicatesMapping_Decorations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DecorationPredicate> getDecorations();

} // RelationsPredicatesMapping
