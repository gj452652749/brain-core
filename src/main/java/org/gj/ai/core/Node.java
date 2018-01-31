package org.gj.ai.core;

import java.util.List;

import org.gj.ai.core.route.Route;

public class Node {
	List<Link> links;
	//后期设置参数，weight大于一定值时方激活
	int weight=0;
	Route route;
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public void link(Node nextNode,int weight) {
		Link link=new Link(nextNode,weight);
		links.add(link);
	}

}
