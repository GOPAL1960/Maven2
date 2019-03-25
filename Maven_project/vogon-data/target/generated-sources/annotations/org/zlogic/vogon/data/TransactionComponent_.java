package org.zlogic.vogon.data;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TransactionComponent.class)
public abstract class TransactionComponent_ {

	public static volatile SingularAttribute<TransactionComponent, Long> amount;
	public static volatile SingularAttribute<TransactionComponent, Long> id;
	public static volatile SingularAttribute<TransactionComponent, Long> version;
	public static volatile SingularAttribute<TransactionComponent, FinanceAccount> account;
	public static volatile SingularAttribute<TransactionComponent, FinanceTransaction> transaction;

}

