package org.gj.ai.core.route;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import org.gj.ai.core.Node;

/**
 * route node池
 * 
 * @author gaojun
 *
 */
public class RouteNodePool {
	Queue<Node> availableNodes = new ArrayDeque<>();
	Queue<Node> activedNodes = new ArrayDeque<>();

	public RouteNodePool() {
		for (int i = 0; i <= 1000; i++) {
			availableNodes.add(new Node());
		}
	}

	public Node activeNode() {
		Node node = availableNodes.poll();
		activedNodes.add(node);
		return node;
	}

	public List<Node> activeNodes(int n) {
		List<Node> nodes = new ArrayList<>();
		for (int i = 0; i <= n - 1; i++) {
			Node node = activeNode();
			nodes.add(node);
		}
		return nodes;
	}

}
