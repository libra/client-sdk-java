// Copyright (c) The Libra Core Contributors
// SPDX-License-Identifier: Apache-2.0

package org.libra.librasdk.jsonrpc;

import org.libra.librasdk.LibraSDKException;

import java.io.IOException;

public class UnexpectedRemoteCallException extends LibraSDKException {
    public UnexpectedRemoteCallException(IOException e) {
        super(e);
    }
}