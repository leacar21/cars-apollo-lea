package com.despegar.cars.apollo.model;

import java.util.Date;

public class FlowHistoryEntry {
	
	private Date begin;
	private Date end;
	private String result;
	private FlowHistoryEntry next;
	
	public Date getBegin() {
		return begin;
	}
	public void setBegin(Date begin) {
		this.begin = begin;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public FlowHistoryEntry getNext() {
		return next;
	}
	public void setNext(FlowHistoryEntry next) {
		this.next = next;
	}
	
}
