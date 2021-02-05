package org.supcom.adapter.output.internal;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.service.component.ComponentContext;
import org.wso2.carbon.device.mgt.output.adapter.xmpp.XMPPEventAdapterFactory;
import org.wso2.carbon.event.output.adapter.core.OutputEventAdapterFactory;


/**
 * @scr.component component.name="output.XMPP.AdapterService.component" immediate="true"
 */
public class XMPPEventAdapterServiceComponent {

    private static final Log log = LogFactory.getLog(XMPPEventAdapterServiceComponent.class);

    /**
     * Deployment of the XMPP event adapter service will be done.
     * @param context bundle context where service is registered
     */
    protected void activate(ComponentContext context) {
        try {
            OutputEventAdapterFactory xmppEventAdapterFactory = new XMPPEventAdapterFactory();
            context.getBundleContext().registerService(OutputEventAdapterFactory.class.getName(),
                    xmppEventAdapterFactory, null);
            if (log.isDebugEnabled()) {
                log.debug("The XMPP publisher service has been deployed successfully");
            }
        } catch (RuntimeException e) {
            log.error("Exception occurred when deploying XMPP publisher service", e);
        }
    }

}