package io.safari94.trimblems.resources;

import io.safari94.trimblems.services.TrackingServ;
import io.safari94.trimblems.soap.tracking.TracePollData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/tracking")
public class TrackingResource {


     @Autowired private TrackingServ trackingService;

     @PostMapping("/gettraces")
     public ResponseEntity<Object> getTraces(@RequestBody Map request){

     TracePollData tracePollData=this.trackingService.getTraces(request.get("username").toString(),request.get("password").toString(),request.get("clientId").toString(),request.get("mark").toString());

     if (tracePollData == null) return new ResponseEntity<>("Something went wrong",new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
     //trackingService.storeTracesonDB(tracePollData.getTraces());
     return new ResponseEntity<>(tracePollData,new HttpHeaders(), HttpStatus.OK);
     }

     @GetMapping("/test")
     public String test(){
     return "test";
     }

}
