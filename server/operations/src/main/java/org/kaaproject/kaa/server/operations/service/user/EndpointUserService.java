/*
 * Copyright 2014 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kaaproject.kaa.server.operations.service.user;

import org.kaaproject.kaa.common.dto.EndpointProfileDto;
import org.kaaproject.kaa.common.endpoint.protocol.EndpointAttachRequest;
import org.kaaproject.kaa.common.endpoint.protocol.EndpointAttachResponse;
import org.kaaproject.kaa.common.endpoint.protocol.EndpointDetachRequest;
import org.kaaproject.kaa.common.endpoint.protocol.EndpointDetachResponse;
import org.kaaproject.kaa.common.endpoint.protocol.EventListenersRequest;
import org.kaaproject.kaa.common.endpoint.protocol.EventListenersResponse;
import org.kaaproject.kaa.common.endpoint.protocol.UserAttachRequest;
import org.kaaproject.kaa.common.endpoint.protocol.UserAttachResponse;
import org.kaaproject.kaa.server.operations.service.cache.AppSeqNumber;

public interface EndpointUserService {

    UserAttachResponse attachUser(EndpointProfileDto profile, UserAttachRequest userAttachRequest);

    EndpointAttachResponse attachEndpoint(EndpointProfileDto profile, EndpointAttachRequest endpointAttachRequest);

    EndpointDetachResponse detachEndpoint(EndpointProfileDto profile, EndpointDetachRequest endpointDetachRequest);

    EventListenersResponse findListeners(EndpointProfileDto profile, AppSeqNumber appSeqNumber, EventListenersRequest request);

}
