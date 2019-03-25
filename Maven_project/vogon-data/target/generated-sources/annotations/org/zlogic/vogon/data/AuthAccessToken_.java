package org.zlogic.vogon.data;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AuthAccessToken.class)
public abstract class AuthAccessToken_ {

	public static volatile SingularAttribute<AuthAccessToken, Date> expires;
	public static volatile SingularAttribute<AuthAccessToken, String> clientId;
	public static volatile SingularAttribute<AuthAccessToken, String> authenticationId;
	public static volatile SingularAttribute<AuthAccessToken, String> id;
	public static volatile SingularAttribute<AuthAccessToken, String> username;
	public static volatile SingularAttribute<AuthAccessToken, String> refreshToken;
	public static volatile SingularAttribute<AuthAccessToken, byte[]> token;
	public static volatile SingularAttribute<AuthAccessToken, byte[]> authentication;

}

