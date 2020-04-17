package io.safari94.trimblems.resources;

import io.safari94.trimblems.data.UploadFileJson;
import io.safari94.trimblems.services.DocumentServ;
import io.safari94.trimblems.soap.documents.DocumentStateData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/documents")
public class DocumentResource {

    @Autowired
    private DocumentServ documentServ;


     @PostMapping("/uploadfile")
     public ResponseEntity<Object> uploadFile(@RequestBody UploadFileJson uploadFileJson){

     DocumentStateData result=this.documentServ.uploadFile(uploadFileJson);


     return new ResponseEntity<>(result,new HttpHeaders(), HttpStatus.OK);
     }

}
