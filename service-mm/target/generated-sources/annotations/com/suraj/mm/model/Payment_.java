package com.suraj.mm.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Payment.class)
public abstract class Payment_ {

	public static volatile SingularAttribute<Payment, String> paymentValue;
	public static volatile SingularAttribute<Payment, String> total;
	public static volatile SingularAttribute<Payment, String> payment_id;
	public static volatile SingularAttribute<Payment, String> paid;
	public static volatile SingularAttribute<Payment, String> userMasterUserId;
	public static volatile SingularAttribute<Payment, String> paymentFlag;
	public static volatile SingularAttribute<Payment, String> workId;
	public static volatile SingularAttribute<Payment, String> paymentDesc;
	public static volatile SingularAttribute<Payment, String> unPaid;

}

