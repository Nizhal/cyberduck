package ch.cyberduck.core.smb;

/*
 * Copyright (c) 2002-2023 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import com.hierynomus.protocol.transport.TransportException;
import com.hierynomus.smbj.common.SMBRuntimeException;

import static org.junit.Assert.assertEquals;

public class SMBTransportExceptionMappingServiceTest {

    @Test
    public void map() {
        assertEquals("Connection failed", new SMBTransportExceptionMappingService().map(new TransportException(new ExecutionException(new SMBRuntimeException(new TimeoutException("Timeout expired"))))).getMessage());
        assertEquals("Timeout expired. The connection attempt timed out. The server may be down, or your network may not be properly configured.", new SMBTransportExceptionMappingService().map(new TransportException(new ExecutionException(new SMBRuntimeException(new TimeoutException("Timeout expired"))))).getDetail());
    }
}