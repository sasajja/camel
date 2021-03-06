/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.openstack.neutron;

import org.apache.camel.component.openstack.AbstractProducerTestSupport;
import org.junit.Before;
import org.mockito.Mock;
import org.openstack4j.api.networking.NetworkService;
import org.openstack4j.api.networking.NetworkingService;
import org.openstack4j.api.networking.PortService;
import org.openstack4j.api.networking.RouterService;
import org.openstack4j.api.networking.SubnetService;

import static org.mockito.Mockito.when;

public class NeutronProducerTestSupport extends AbstractProducerTestSupport {

    @Mock
    protected NeutronEndpoint endpoint;

    @Mock
    protected NetworkingService networkingService;

    @Mock
    PortService portService;

    @Mock
    RouterService routerService;

    @Mock
    SubnetService subnetService;

    @Mock
    NetworkService networkService;

    @Before
    public void setUpComputeService() {
        when(client.networking()).thenReturn(networkingService);
        when(networkingService.port()).thenReturn(portService);
        when(networkingService.router()).thenReturn(routerService);
        when(networkingService.subnet()).thenReturn(subnetService);
        when(networkingService.network()).thenReturn(networkService);
    }
}
