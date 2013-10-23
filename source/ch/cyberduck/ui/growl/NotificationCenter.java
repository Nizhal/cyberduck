package ch.cyberduck.ui.growl;

/*
 * Copyright (c) 2012 David Kocher. All rights reserved.
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

import ch.cyberduck.core.LocaleFactory;
import ch.cyberduck.ui.cocoa.foundation.NSUserNotification;
import ch.cyberduck.ui.cocoa.foundation.NSUserNotificationCenter;

import org.apache.log4j.Logger;

/**
 * @version $Id$
 */
public class NotificationCenter implements Growl {
    private static final Logger log = Logger.getLogger(NotificationCenter.class);

    public static void register() {
        if(!Factory.VERSION_PLATFORM.matches("10\\.(5|6|7).*")) {
            GrowlFactory.addFactory(Factory.VERSION_PLATFORM, new Factory());
        }
        else {
            log.warn(String.format("Skip registering notifications on %s", Factory.VERSION_PLATFORM));
        }
    }

    private NSUserNotificationCenter center
            = NSUserNotificationCenter.defaultUserNotificationCenter();

    protected NotificationCenter() {
        //
    }

    @Override
    public void setup() {
        //
    }

    @Override
    public void notify(final String title, final String description) {
        final NSUserNotification notification = NSUserNotification.notification();
        notification.setTitle(LocaleFactory.localizedString(title, "Status"));
        notification.setInformativeText(description);
        center.scheduleNotification(notification);
    }

    @Override
    public void notifyWithImage(final String title, final String description, final String image) {
        // No support for custom image. Always use application icon
        this.notify(title, description);
    }

    private static class Factory extends GrowlFactory {
        @Override
        protected Growl create() {
            return new NotificationCenter();
        }
    }
}