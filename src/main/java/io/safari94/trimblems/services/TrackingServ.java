package io.safari94.trimblems.services;

import io.safari94.trimblems.dao.TracesDAO;
import io.safari94.trimblems.soap.tracking.TraceData;
import io.safari94.trimblems.soap.tracking.TracePollData;
import io.safari94.trimblems.soap.tracking.Tracking;
import io.safari94.trimblems.soap.tracking.TrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.BindingProvider;
import java.net.URL;
import java.util.List;
import java.util.Map;

@Service
public class TrackingServ {

    private static final String WS_URL="https://soap-ssl.box.trimbletl.com/fleet-service/Tracking";

    @Autowired private TracesDAO tracesDAO;

    public TracePollData getTraces(String username, String password, String clientID, String mark) {

        try {
            URL url = new URL(WS_URL);
            TrackingService trackingService = new TrackingService(url);
            Tracking tracking = trackingService.getTrackingPort();


            /*******************UserName & Password ******************************/
            Map<String, Object> req_ctx = ((BindingProvider) tracking).getRequestContext();
            req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL);

            Map<String, Object> requestContext = ((BindingProvider)
                    tracking).getRequestContext();
            requestContext.put(BindingProvider.USERNAME_PROPERTY, username);
            requestContext.put(BindingProvider.PASSWORD_PROPERTY, password);

            /**********************************************************************/

            return tracking.pollTraces(clientID, mark);


        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

        public void storeTracesonDB(List<TraceData> traces){

            for(TraceData t:traces){
                this.tracesDAO.save(t);
            }
        }

}

