package org.gj.ai.core;

public class Link {
	Node node;
	float weight=0;
	public Link() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Link(Node node, float weight) {
		super();
		this.node = node;
		this.weight = weight;
	}
	public void strengthen() {
		weight=weight+0.1f;
	}
}
