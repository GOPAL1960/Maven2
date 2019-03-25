package org.zlogic.vogon.data;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AuthRefreshToken.class)
public abstract class AuthRefreshToken_ {

	public static volatile SingularAttribute<AuthRefreshToken, String> id;
	public static volatile SingularAttribute<AuthRefreshToken, byte[]> token;
	public static volatile SingularAttribute<AuthRefreshToken, byte[]> authentication;

}

