package com.interview.barclays.traders.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Trades")
public class TradesEntity{

	@EmbeddedId
	TradesEntityPK tradesEntityPK;

	String Counter_Party_Id;

	String Book_id;

	Date Maturity_Date;

	Date Created_Date;

	char Expired;

	public TradesEntityPK getTradesEntityPK() {
		return tradesEntityPK;
	}

	public void setTradesEntityPK(TradesEntityPK tradesEntityPK) {
		this.tradesEntityPK = tradesEntityPK;
	}

	public String getCounter_Party_Id() {
		return Counter_Party_Id;
	}

	public void setCounter_Party_Id(String counter_Party_Id) {
		Counter_Party_Id = counter_Party_Id;
	}

	public String getBook_id() {
		return Book_id;
	}

	public void setBook_id(String book_id) {
		Book_id = book_id;
	}

	public Date getMaturity_Date() {
		return Maturity_Date;
	}

	public void setMaturity_Date(Date maturity_Date) {
		Maturity_Date = maturity_Date;
	}

	public Date getCreated_Date() {
		return Created_Date;
	}

	public void setCreated_Date(Date created_Date) {
		Created_Date = created_Date;
	}

	public char getExpired() {
		return Expired;
	}

	public void setExpired(char expired) {
		Expired = expired;
	}

	@Override
	public String toString() {
		return "TradesEntity [tradesEntityPK=" + tradesEntityPK + ", Counter_Party_Id=" + Counter_Party_Id
				+ ", Book_id=" + Book_id + ", Maturity_Date=" + Maturity_Date + ", Created_Date=" + Created_Date
				+ ", Expired=" + Expired + "]";
	}

}
