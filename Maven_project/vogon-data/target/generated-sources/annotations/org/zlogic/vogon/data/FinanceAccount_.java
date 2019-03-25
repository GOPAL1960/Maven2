package org.zlogic.vogon.data;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FinanceAccount.class)
public abstract class FinanceAccount_ {

	public static volatile SingularAttribute<FinanceAccount, VogonUser> owner;
	public static volatile SingularAttribute<FinanceAccount, Boolean> includeInTotal;
	public static volatile SingularAttribute<FinanceAccount, Long> balance;
	public static volatile SingularAttribute<FinanceAccount, Boolean> showInList;
	public static volatile SingularAttribute<FinanceAccount, String> name;
	public static volatile SingularAttribute<FinanceAccount, String> currency;
	public static volatile SingularAttribute<FinanceAccount, Long> id;
	public static volatile SingularAttribute<FinanceAccount, Long> version;
	public static volatile SetAttribute<FinanceAccount, TransactionComponent> transactionComponents;

}

