package com.interview.barclays.traders.DTO;

import java.sql.Date;

public class TradesDTO {

	String Trade_Id;
	Integer Version;
	String Counter_Party_Id;
	String Book_id;
	Date Maturity_Date;
	Date Created_Date;
	char Expired;

	public TradesDTO() {
		super();
	}

	public String getTrade_Id() {
		return Trade_Id;
	}

	public void setTrade_Id(String trade_Id) {
		Trade_Id = trade_Id;
	}

	public Integer getVersion() {
		return Version;
	}

	public void setVersion(Integer version) {
		Version = version;
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
		return "TradesDTO [Trade_Id=" + Trade_Id + ", Version=" + Version + ", Counter_Party_Id=" + Counter_Party_Id
				+ ", Book_id=" + Book_id + ", Maturity_Date=" + Maturity_Date + ", Created_Date=" + Created_Date
				+ ", Expired=" + Expired + "]";
	}

}
