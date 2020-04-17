package io.safari94.trimblems.services;

import io.safari94.trimblems.data.UploadFileJson;
import io.safari94.trimblems.soap.documents.Document;
import io.safari94.trimblems.soap.documents.DocumentData;
import io.safari94.trimblems.soap.documents.DocumentService;
import io.safari94.trimblems.soap.documents.DocumentStateData;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Service;

import javax.xml.ws.BindingProvider;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Map;

@Service
public class DocumentServ {

    private static final String WS_URL = "https://soap.box.trimbletl.com/fleet-service/Document";



    public DocumentStateData uploadFile(UploadFileJson uploadFileJson) {

        try {
            URL url = new URL(WS_URL);
            DocumentService documentService = new DocumentService(url);
            Document document = documentService.getDocumentPort();


            Map<String, Object> req_ctx = ((BindingProvider) document).getRequestContext();
            req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL);

            Map<String, Object> requestContext = ((BindingProvider)
                    document).getRequestContext();
            requestContext.put(BindingProvider.USERNAME_PROPERTY, uploadFileJson.getUsername());
            requestContext.put(BindingProvider.PASSWORD_PROPERTY, uploadFileJson.getPassword());

            // Using Apache Commons IOUtils to read file into byte array
            FileInputStream fis = new FileInputStream(uploadFileJson.getFileUrl());
            byte[] encodedFile = IOUtils.toByteArray(fis);


            //File file = new File(uploadFileJson.getFileUrl());
            //byte[] encodedFile = Base64.encodeBase64(FileUtils.readFileToByteArray(file));
            DocumentData documentData = new DocumentData();
            documentData.setFileContent(encodedFile);
            documentData.setFileName(uploadFileJson.getDocName());
            documentData.setFileType("pdf");
            documentData.setIsPermanent(false);
            System.out.println(documentData.toString());
            return document.createDocument(uploadFileJson.getCustomerId(), documentData);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;


    }
}
