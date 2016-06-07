package ch.cyberduck.ui.comparator;

/*
 * Copyright (c) 2002-2010 David Kocher. All rights reserved.
 *
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
 * dkocher@cyberduck.ch
 */

import ch.cyberduck.core.Path;

import org.apache.commons.lang3.StringUtils;

public class OwnerComparator extends BrowserComparator {
    private static final long serialVersionUID = -3411022739897657092L;

    public OwnerComparator(boolean ascending) {
        super(ascending, new FilenameComparator(ascending));
    }

    @Override
    protected int compareFirst(final Path p1, final Path p2) {
        if(StringUtils.isBlank(p1.attributes().getOwner()) && StringUtils.isBlank(p2.attributes().getOwner())) {
            return 0;
        }
        if(StringUtils.isBlank(p1.attributes().getOwner())) {
            return -1;
        }
        if(StringUtils.isBlank(p2.attributes().getOwner())) {
            return 1;
        }
        if(ascending) {
            return p1.attributes().getOwner().compareToIgnoreCase(p2.attributes().getOwner());
        }
        return -p1.attributes().getOwner().compareToIgnoreCase(p2.attributes().getOwner());
    }

}
