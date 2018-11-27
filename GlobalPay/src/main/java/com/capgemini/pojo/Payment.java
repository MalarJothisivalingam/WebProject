package com.capgemini.pojo;

public class Payment {
	private String transactionId;
	private String ticketNo;
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}
	@Override
	public String toString() {
		return "Payment [transactionId=" + transactionId + ", ticketNo="
				+ ticketNo + "]";
	}
	

}
