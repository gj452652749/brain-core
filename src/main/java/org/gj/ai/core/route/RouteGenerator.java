package org.gj.ai.core.route;

import org.gj.ai.core.Link;
import org.gj.ai.core.Node;

public class RouteGenerator {
	/**
	 * 
	 * @param in
	 * @param activedNode 通过activedNode将in、out链接起来
	 * @param out 暂时为in的镜像
	 */
	public void generate(Node in,Node activedNode,Node out) {
		Route route=new Route();
		route.addLink(new Link(activedNode,0.1f));
		route.addLink(new Link(out,0.1f));
		in.setRoute(route);
	}

}
