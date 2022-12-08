package ch.cyberduck.core.comparison;/*
 * Copyright (c) 2002-2022 iterate GmbH. All rights reserved.
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

import ch.cyberduck.core.Path;
import ch.cyberduck.core.PathAttributes;
import ch.cyberduck.core.features.AttributesComparison;
import ch.cyberduck.core.synchronization.Comparison;

public class ChainedAttributesComparison implements AttributesComparison {

    private final AttributesComparison[] delegates;

    public ChainedAttributesComparison(final AttributesComparison... delegates) {
        this.delegates = delegates;
    }

    @Override
    public Comparison compare(final Path.Type type, final PathAttributes file, final PathAttributes other) {
        for(AttributesComparison delegate : delegates) {
            final Comparison result = delegate.compare(type, file, other);
            if(result == Comparison.unknown) {
                continue;
            }
            return result;
        }
        return Comparison.unknown;
    }
}
