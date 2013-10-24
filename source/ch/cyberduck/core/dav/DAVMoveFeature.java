package ch.cyberduck.core.dav;

/*
 * Copyright (c) 2002-2013 David Kocher. All rights reserved.
 * http://cyberduck.ch/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * Bug fixes, suggestions and comments should be sent to:
 * feedback@cyberduck.ch
 */

import ch.cyberduck.core.DefaultIOExceptionMappingService;
import ch.cyberduck.core.DescriptiveUrl;
import ch.cyberduck.core.Path;
import ch.cyberduck.core.exception.BackgroundException;
import ch.cyberduck.core.features.Move;
import ch.cyberduck.core.shared.DefaultUrlProvider;

import java.io.IOException;

import com.github.sardine.impl.SardineException;

/**
 * @version $Id$
 */
public class DAVMoveFeature implements Move {

    private DAVSession session;

    public DAVMoveFeature(final DAVSession session) {
        this.session = session;
    }

    @Override
    public void move(final Path file, final Path renamed, boolean exists) throws BackgroundException {
        try {
            session.getClient().move(new DAVPathEncoder().encode(file),
                    new DefaultUrlProvider(session.getHost()).toUrl(renamed).find(DescriptiveUrl.Type.provider).getUrl());
        }
        catch(SardineException e) {
            throw new DAVExceptionMappingService().map("Cannot rename {0}", e, file);
        }
        catch(IOException e) {
            throw new DefaultIOExceptionMappingService().map(e, file);
        }
    }

    @Override
    public boolean isSupported(final Path file) {
        return true;
    }
}
