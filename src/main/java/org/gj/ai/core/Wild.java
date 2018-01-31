package org.gj.ai.core;

public class Wild {
	protected int w=10;
	protected int h=10;
	protected Node[][] nodes;
	public int getW() {
		return w;
	}
	public int getH() {
		return h;
	}
	public int getSize() {
		return w*h;
	}
	public Node get(int x,int y) {
		return nodes[x][y];
	}
	
}
