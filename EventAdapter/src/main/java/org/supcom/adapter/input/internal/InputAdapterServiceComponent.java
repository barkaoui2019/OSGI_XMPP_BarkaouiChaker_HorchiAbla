package org.supcom.adapter.input.internal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.http.HttpService;
import org.wso2.carbon.device.mgt.input.adapter.xmpp.XMPPEventAdapterFactory;
import org.wso2.carbon.event.input.adapter.core.InputEventAdapterFactory;
import org.wso2.carbon.user.core.service.RealmService;

/**
 * @scr.component name="input.iot.xmpp.AdapterService.component" immediate="true"
 * @scr.reference name="user.realmservice.default"
 * interface="org.wso2.carbon.user.core.service.RealmService" cardinality="1..1"
 * policy="dynamic" bind="setRealmService" unbind="unsetRealmService"
 */
public class InputAdapterServiceComponent {

    private static final Log log = LogFactory.getLog(InputAdapterServiceComponent.class);

    protected void activate(ComponentContext context) {
        try {
            InputEventAdapterFactory xmppEventEventAdapterFactory = new XMPPEventAdapterFactory();
            context.getBundleContext().registerService(InputEventAdapterFactory.class.getName(),
                    xmppEventEventAdapterFactory, null);
            if (log.isDebugEnabled()) {
                log.debug("Successfully deployed the input adapter service");
            }
        } catch (RuntimeException e) {
            log.error("Can not create the input adapter service ", e);
        }
    }

    protected void setRealmService(RealmService realmService) {
        InputAdapterServiceDataHolder.registerRealmService(realmService);
    }

    protected void unsetRealmService(RealmService realmService) {
        InputAdapterServiceDataHolder.registerRealmService(null);
    }

    protected void setHttpService(HttpService httpService) {
        InputAdapterServiceDataHolder.registerHTTPService(httpService);
    }

    protected void unsetHttpService(HttpService httpService) {
        InputAdapterServiceDataHolder.registerHTTPService(null);
    }

}