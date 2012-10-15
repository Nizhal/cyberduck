package ch.cyberduck.core.urlhandler;

import ch.cyberduck.core.Factory;
import ch.cyberduck.core.Scheme;
import ch.cyberduck.core.editor.Application;

import org.apache.log4j.Logger;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @version $Id:$
 */
public abstract class SchemeHandlerFactory extends Factory<SchemeHandler> {
    private static final Logger log = Logger.getLogger(SchemeHandlerFactory.class);

    /**
     * Registered factories
     */
    protected static final Map<Platform, SchemeHandlerFactory> factories
            = new HashMap<Platform, SchemeHandlerFactory>();

    public static void addFactory(Factory.Platform platform, SchemeHandlerFactory f) {
        factories.put(platform, f);
    }

    private static SchemeHandler service;

    public static SchemeHandler instance() {
        if(null == service) {
            if(!factories.containsKey(NATIVE_PLATFORM)) {
                log.warn(String.format("No implementation for %s", NATIVE_PLATFORM));
                return new DisabledSchemeHandler();
            }
            service = factories.get(NATIVE_PLATFORM).create();
        }
        return service;
    }

    private static final class DisabledSchemeHandler implements SchemeHandler {
        @Override
        public void setDefaultHandler(final List<Scheme> scheme, final Application application) {
            //
        }

        @Override
        public Application getDefaultHandler(final Scheme scheme) {
            return null;
        }

        @Override
        public boolean isDefaultHandler(final List<Scheme> scheme, final Application application) {
            return false;
        }

        @Override
        public List<Application> getAllHandlers(final Scheme scheme) {
            return Collections.emptyList();
        }
    }
}
