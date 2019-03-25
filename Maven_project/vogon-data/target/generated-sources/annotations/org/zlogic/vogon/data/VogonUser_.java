package org.zlogic.vogon.data;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(VogonUser.class)
public abstract class VogonUser_ {

	public static volatile SingularAttribute<VogonUser, String> password;
	public static volatile SingularAttribute<VogonUser, Long> id;
	public static volatile SetAttribute<VogonUser, FinanceAccount> accounts;
	public static volatile SetAttribute<VogonUser, FinanceTransaction> transactions;
	public static volatile SingularAttribute<VogonUser, Long> version;
	public static volatile SingularAttribute<VogonUser, String> username;

}

