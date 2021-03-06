/*
 * Vogon personal finance/expense analyzer.
 * Licensed under Apache 2.0 License: http://www.apache.org/licenses/LICENSE-2.0
 * Author: Dmitry Zolotukhin <zlogic@gmail.com>
 */
package org.zlogic.vogon.data;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

/**
 * Implements a transaction (amount associated with a specific account)
 *
 * @author Dmitry Zolotukhin [zlogic@gmail.com]
 */
@Entity
public class TransactionComponent implements Serializable {

	/**
	 * Version UID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The transaction ID (only for persistence)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	protected Long id;
	/**
	 * JPA version
	 */
	@Version
	private long version = 0L;
	/**
	 * The account
	 */
	@ManyToOne
	@JoinColumn
	protected FinanceAccount account;
	/**
	 * The transaction
	 */
	@ManyToOne
	@JoinColumn
	protected FinanceTransaction transaction;
	/**
	 * The amount this component changes the account's balance
	 */
	protected Long amount;

	/**
	 * Default constructor for a transaction component
	 */
	protected TransactionComponent() {
	}

	/**
	 * Constructor for a transaction component
	 *
	 * @param account the account
	 * @param transaction the transaction
	 * @param amount the amount which this component modifies the account, can
	 * be both negative and positive
	 */
	public TransactionComponent(FinanceAccount account, FinanceTransaction transaction, long amount) {
		//TODO: consider removing this
		this.amount = amount;
		TransactionComponent.this.setAccount(account);
		TransactionComponent.this.setTransaction(transaction);
	}

	/*
	 * Getters/setters
	 */
	/**
	 * Returns the associated account
	 *
	 * @return the account
	 */
	public FinanceAccount getAccount() {
		return account;
	}

	/**
	 * Sets the associated account
	 *
	 * @param account the account to set
	 */
	public void setAccount(FinanceAccount account) {
		if ((this.account != null && this.account.equals(account)) || (this.account == null && account == null))
			return;
		FinanceAccount savedAccount = this.account;
		this.account = account;
		if (savedAccount != null)
			savedAccount.removeComponent(this);
		if (account != null)
			account.addComponent(this);
	}

	/**
	 * Returns the associated transaction
	 *
	 * @return the transaction
	 */
	public FinanceTransaction getTransaction() {
		return transaction;
	}

	/**
	 * Sets the associated transaction
	 *
	 * @param transaction the account to set
	 */
	public void setTransaction(FinanceTransaction transaction) {
		if ((this.transaction != null && this.transaction.equals(transaction)) || (this.transaction == null && transaction == null))
			return;
		FinanceTransaction savedTransaction = this.transaction;
		this.transaction = transaction;
		if (savedTransaction != null)
			savedTransaction.removeComponent(this);
		if (transaction != null)
			transaction.addComponent(this);
	}

	/**
	 * Returns the raw amount (should be divided by
	 * Constants.rawAmountMultiplier to get the real amount)
	 *
	 * @return the raw amount
	 */
	public Long getRawAmount() {
		return amount;
	}

	/**
	 * Sets a new raw amount (should be divided by Constants.rawAmountMultiplier
	 * to get the real amount); also updates the account balance
	 *
	 * @param amount the new raw amount
	 */
	public void setRawAmount(long amount) {
		FinanceAccount savedAccount = account;
		if (account != null)
			account.removeComponent(this);
		this.amount = amount;
		if (savedAccount!= null)
			savedAccount.addComponent(this);
	}

	/**
	 * Returns the real amount
	 *
	 * @return the raw amount
	 */
	public double getAmount() {
		return amount / Constants.RAW_AMOUNT_MULTIPLIER;
	}

	/**
	 * Returns the ID for this class instance
	 *
	 * @return the ID for this class instance
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Returns the version for this class instance
	 *
	 * @return the version for this class instance
	 */
	public long getVersion() {
		return version;
	}

	/**
	 * Sets the version of this class instance
	 *
	 * @param version the version of this class instance
	 */
	protected void setVersion(long version) {
		this.version = version;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TransactionComponent)
			return id != null ? id.equals(((TransactionComponent) obj).id) : false;
		else
			return this == obj;
	}

	@Override
	public int hashCode() {
		long hashId = this.id != null ? this.id : -1;
		int hash = 7;
		hash = 97 * hash + (int) (hashId ^ (hashId >>> 32));
		return hash;
	}
}
