package com.interview.barclays.traders.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class TradesEntityPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String Trade_Id;
	Integer Version;

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

	@Override
	public String toString() {
		return "TradesEntityPK [Trade_Id=" + Trade_Id + ", Version=" + Version + "]";
	}

}
