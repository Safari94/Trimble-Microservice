package io.safari94.trimblems.data;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UploadFileJson {

    private String username;
    private String password;
    private String customerId;
    private String fileUrl;
    private String docName;
}
