package com.taotao.common.pojo;

import java.util.List;

/**
 * 树形控件节点格式
 * <p>Title: EUTreeNode</p>
 */
public class EUTreeNode {

	private long id;
	private String text;
	private String state;
	private List<?> children;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public List<?> getChildren() {
		return children;
	}
	public void setChildren(List<?> children) {
		this.children = children;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
