package org.gj.ai.core.action;

import java.util.List;

import org.gj.ai.core.Node;
import org.gj.ai.core.input.InputWild;
import org.gj.ai.core.route.RouteGenerator;
import org.gj.ai.core.route.RouteNodePool;

public class Training {
	RouteNodePool routeNodePool;
	RouteGenerator routeGenerator;

	/**
	 * 
	 * @param sensorWilds
	 *            已排序的感受野
	 */
	public void experience(List<InputWild> sensorWilds) {
		sensorWilds.sort((InputWild e1, InputWild e2) -> e1.getSize() - e2.getSize());
		List<Node> activedNodes = routeNodePool.activeNodes(sensorWilds.get(0).getSize());
		for (InputWild sensor : sensorWilds) {
			explore(sensor,activedNodes);
		}
	}

	/**
	 * 感受野激活的神经元
	 * 
	 * @param sensor
	 * @param activedNodes
	 */
	public void explore(InputWild sensor, List<Node> activedNodes) {
		for(int i=0;i<=sensor.getH()-1;)
			for(int j=0;j<=sensor.getW();) {
				int activedNodeIndex=i*sensor.getW()+j;
				routeGenerator.generate(sensor.get(i, j), 
						activedNodes.get(activedNodeIndex),sensor.get(i, j));
			}
	}

}
