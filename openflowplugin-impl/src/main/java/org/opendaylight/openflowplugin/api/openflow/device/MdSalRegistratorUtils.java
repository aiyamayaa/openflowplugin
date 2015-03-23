/**
 * Copyright (c) 2015 Cisco Systems, Inc. and others.  All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.openflowplugin.api.openflow.device;

import org.opendaylight.openflowplugin.api.openflow.rpc.RpcContext;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.SalFlowService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.OpendaylightFlowStatisticsService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.OpendaylightFlowTableStatisticsService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.SalGroupService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.OpendaylightGroupStatisticsService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.SalMeterService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.OpendaylightMeterStatisticsService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.module.config.rev141015.NodeConfigService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketProcessingService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.OpendaylightPortStatisticsService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.OpendaylightQueueStatisticsService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.SalTableService;

/**
 * @author joe
 * 
 */
public class MdSalRegistratorUtils {

    private MdSalRegistratorUtils() {
        throw new IllegalStateException();
    }

    public static void registerServices(final RpcContext rpcContext) {
        rpcContext.registerRpcServiceImplementation(SalFlowService.class, new SalFlowServiceImpl(rpcContext));
        rpcContext.registerRpcServiceImplementation(SalFlowService.class, new SalFlowServiceImpl(rpcContext));
        rpcContext.registerRpcServiceImplementation(SalMeterService.class, new SalMeterServiceImpl(rpcContext));
        rpcContext.registerRpcServiceImplementation(SalGroupService.class, new SalGroupServiceImpl(rpcContext));
        rpcContext.registerRpcServiceImplementation(SalTableService.class, new SalTableServiceImpl(rpcContext));
        rpcContext.registerRpcServiceImplementation(PacketProcessingService.class, new PacketProcessingServiceImpl(rpcContext));
        rpcContext.registerRpcServiceImplementation(OpendaylightFlowStatisticsService.class,
                new OpendaylightFlowStatisticsServiceImpl(rpcContext));
        rpcContext.registerRpcServiceImplementation(OpendaylightGroupStatisticsService.class,
                new OpendaylightGroupStatisticsServiceImpl(rpcContext));
        rpcContext.registerRpcServiceImplementation(OpendaylightMeterStatisticsService.class,
                new OpendaylightMeterStatisticsServiceImpl(rpcContext));
        rpcContext.registerRpcServiceImplementation(OpendaylightPortStatisticsService.class,
                new OpendaylightPortStatisticsServiceImpl(rpcContext));
        rpcContext.registerRpcServiceImplementation(NodeConfigService.class, new NodeConfigServiceImpl(rpcContext));
        rpcContext.registerRpcServiceImplementation(OpendaylightFlowTableStatisticsService.class,
                new OpendaylightFlowTableStatisticsServiceImpl(rpcContext));
        rpcContext.registerRpcServiceImplementation(OpendaylightQueueStatisticsService.class,
                new OpendaylightQueueStatisticsServiceImpl(rpcContext));
    }

}
