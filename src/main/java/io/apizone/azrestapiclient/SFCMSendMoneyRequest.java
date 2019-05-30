/**
 * 
 */
package io.apizone.azrestapiclient;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author schowdhary
 *
 */


public class SFCMSendMoneyRequest {
	
	private Identifier identifier;
	private Content content;
	
	
	
	
	public SFCMSendMoneyRequest() {
		super();
	}


	public SFCMSendMoneyRequest(Identifier identifier, Content content) {
		super();
		this.identifier = identifier;
		this.content = content;
	}


	static class Identifier {
		
		private String xref;
		private String channel;
		
		@JsonProperty("bank_code")
		private String bankCode;
		
		
		public String getXref() {
			return xref;
		}
		public void setXref(String xref) {
			this.xref = xref;
		}
		public String getChannel() {
			return channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
		}
		public String getBankCode() {
			return bankCode;
		}
		public void setBankCode(String bankCode) {
			this.bankCode = bankCode;
		}
		public Identifier(String xref, String channel, String bankCode) {
			super();
			this.xref = xref;
			this.channel = channel;
			this.bankCode = bankCode;
		}
		
		
		
	}

	
	static class Content{
		
		@JsonProperty("cbs_reference")
		private String cbsReference;
		
		@JsonProperty("transaction_amount")
		private Double transactionAmount;
		
		@JsonProperty("credit_party")
		private String creditParty;
		
		@JsonProperty("customer_msisdn")
		private String customerMsisdn;
		
		@JsonProperty("customer_name")
		private String customerName;
		
		@JsonProperty("account_reference")
		private String accountReference;
		
		@JsonProperty("invoice_number")
		private String invoiceNumber;
		
		@JsonProperty("narration")
		private String narration;
		
		@JsonProperty("transaction_type")
		private String transactionType;
		
		
		public String getCbsReference() {
			return cbsReference;
		}
		public void setCbsReference(String cbsReference) {
			this.cbsReference = cbsReference;
		}
		public Double getTransactionAmount() {
			return transactionAmount;
		}
		public void setTransactionAmount(Double transactionAmount) {
			this.transactionAmount = transactionAmount;
		}
		public String getCreditParty() {
			return creditParty;
		}
		public void setCreditParty(String creditParty) {
			this.creditParty = creditParty;
		}
		public String getCustomerMsisdn() {
			return customerMsisdn;
		}
		public void setCustomerMsisdn(String customerMsisdn) {
			this.customerMsisdn = customerMsisdn;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getAccountReference() {
			return accountReference;
		}
		public void setAccountReference(String accountReference) {
			this.accountReference = accountReference;
		}
		public String getInvoiceNumber() {
			return invoiceNumber;
		}
		public void setInvoiceNumber(String invoiceNumber) {
			this.invoiceNumber = invoiceNumber;
		}
		public String getNarration() {
			return narration;
		}
		public void setNarration(String narration) {
			this.narration = narration;
		}
		public String getTransactionType() {
			return transactionType;
		}
		public void setTransactionType(String transactionType) {
			this.transactionType = transactionType;
		}
		public Content(String cbsReference, Double transactionAmount, String creditParty, String customerMsisdn,
				String customerName, String accountReference, String invoiceNumber, String narration,
				String transactionType) {
			super();
			this.cbsReference = cbsReference;
			this.transactionAmount = transactionAmount;
			this.creditParty = creditParty;
			this.customerMsisdn = customerMsisdn;
			this.customerName = customerName;
			this.accountReference = accountReference;
			this.invoiceNumber = invoiceNumber;
			this.narration = narration;
			this.transactionType = transactionType;
		}
		
		
		
	}


	public Identifier getIdentifier() {
		return identifier;
	}


	public void setIdentifier(Identifier identifier) {
		this.identifier = identifier;
	}


	public Content getContent() {
		return content;
	}


	public void setContent(Content content) {
		this.content = content;
	}
	
	
}
