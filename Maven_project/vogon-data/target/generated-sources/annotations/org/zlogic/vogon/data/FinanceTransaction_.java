package org.zlogic.vogon.data;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.zlogic.vogon.data.FinanceTransaction.Type;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FinanceTransaction.class)
public abstract class FinanceTransaction_ {

	public static volatile SingularAttribute<FinanceTransaction, VogonUser> owner;
	public static volatile SetAttribute<FinanceTransaction, TransactionComponent> components;
	public static volatile SingularAttribute<FinanceTransaction, String> description;
	public static volatile SingularAttribute<FinanceTransaction, Long> id;
	public static volatile SingularAttribute<FinanceTransaction, Type> type;
	public static volatile SingularAttribute<FinanceTransaction, Date> transactionDate;
	public static volatile SingularAttribute<FinanceTransaction, Long> version;
	public static volatile SetAttribute<FinanceTransaction, String> tags;

}

