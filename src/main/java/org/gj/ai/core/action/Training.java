package org.gj.ai.core.action;

import java.util.List;
import java.util.Queue;

import org.gj.ai.core.Node;
import org.gj.ai.core.input.InputWild;
import org.gj.ai.core.route.RouteNodePool;

public class Training {
	RouteNodePool routeNodePool;

	/**
	 * 
	 * @param sensorWilds
	 *            已排序的感受野
	 */
	public void experience(List<InputWild> sensorWilds) {
		sensorWilds.sort((InputWild e1, InputWild e2) -> e1.getSize() - e2.getSize());
		Queue<Node> activedNodes = routeNodePool.activeNodes(sensorWilds.get(0).getSize());
		for (int i = 0; i <= activedNodes.size() - 1;) {
			for (InputWild sensor : sensorWilds) {
				if(i>(sensor.getSize()-1))
					continue;
				//explore(sensor);
			}
		}
	}

	/**
	 * 感受野激活的神经元
	 * @param sensor
	 * @param activedNodes
	 */
	public void explore(InputWild sensor,Queue<Node> activedNodes) {

	}

}
