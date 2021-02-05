package org.supcom.adapter.input.internal;

import org.osgi.service.http.HttpService;
import org.wso2.carbon.user.core.service.RealmService;

/**
 * common place to hold some OSGI service references.
 */
public final class InputAdapterServiceDataHolder {

    private static RealmService realmService;
    private static HttpService httpService;

    private InputAdapterServiceDataHolder() {
    }

    public static void registerRealmService(
            RealmService realmService) {
        InputAdapterServiceDataHolder.realmService = realmService;
    }

    public static RealmService getRealmService() {
        return realmService;
    }

    public static void registerHTTPService(
            HttpService httpService) {
        InputAdapterServiceDataHolder.httpService = httpService;
    }

    public static HttpService getHTTPService() {
        return httpService;
    }


}
