package com.taotao.common.pojo;

import java.util.List;

/**
 * 树形控件节点格式
 * <p>Title: EUTreeNode</p>
 */
public class EUTreeNode2 {

	private long id;
	private String text;
	private EUTreeState state;
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
	public EUTreeState getState() {
		return state;
	}
	public void setState(EUTreeState state) {
		this.state = state;
	}
	
}
