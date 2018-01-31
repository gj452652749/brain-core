package org.gj.ai.core.route;

import java.util.List;

import org.gj.ai.core.Link;

/**
 * 一个input对应多个route
 * @author gaojun
 *
 */
public class Route {
	List<Link> links;

	public void addLink(Link link) {
		links.add(link);
	}
	/**
	 * 点对应，则学习强化
	 */
	public void strengthen() {
		for(Link link:links)
			link.strengthen();
	}
	/**
	 * 纠正弱化
	 */
	public void weaken() {
		
	}
}
