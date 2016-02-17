/*******************************************************************************
 *     Cloud Foundry
 *     Copyright (c) [2009-2014] Pivotal Software, Inc. All Rights Reserved.
 *
 *     This product is licensed to you under the Apache License, Version 2.0 (the "License").
 *     You may not use this product except in compliance with the License.
 *
 *     This product includes a number of subcomponents with
 *     separate copyright notices and license terms. Your use of these
 *     subcomponents is subject to the terms and conditions of the
 *     subcomponent's license, as noted in the LICENSE file.
 *******************************************************************************/
package org.cloudfoundry.identity.uaa.oauth.approval;

import java.util.List;

import org.cloudfoundry.identity.uaa.message.SimpleMessage;

public interface ApprovalsControllerService {
    public List<Approval> getApprovals(String filter, int startIndex, int count);
    public List<Approval> updateApprovals(Approval[] approvals);
    public List<Approval> updateClientApprovals(String clientId, Approval[] approvals);
    public SimpleMessage revokeApprovals(String clientId);
}