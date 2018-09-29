package com.douggschwind.example.controller;

import com.douggschwind.example.jsonbean.NewUserJsonBean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping(path = UserController.MY_BASE_URI)
public class UserController {

    protected static final String MY_BASE_URI = "/users";

    private static final String ENCRYPTION_ALGORITHM_IDENTIFIER = "AES";

    private URI getURI(String uri) {
        return URI.create(uri);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> registerNewUser(@RequestBody NewUserJsonBean newUserJsonBean) {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Requesting new user with email address <" + newUserJsonBean.getEmailAddress() + ">");
        System.out.println("Requesting new user with plaintext password <" + newUserJsonBean.getPlainTextPassword() + ">");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
        return ResponseEntity.created(getURI(MY_BASE_URI + "/123")).build();
    }

//    private static byte[] encryptPlainText(String plainText, SecretKey secretKey, SecureRandom secureRandom) throws Exception {
//        Cipher cipher = Cipher.getInstance(ENCRYPTION_ALGORITHM_IDENTIFIER);
//        cipher.init(Cipher.ENCRYPT_MODE, secretKey, secureRandom);
//        return cipher.doFinal(plainText.getBytes());
//    }
//
//    private static String decryptEncryptedText(SecretKey secretKey, SecureRandom secureRandom, byte[] encryptedText) throws Exception {
//        Cipher cipher = Cipher.getInstance(ENCRYPTION_ALGORITHM_IDENTIFIER);
//        cipher.init(Cipher.DECRYPT_MODE, secretKey, secureRandom);
//        return new String(cipher.doFinal(encryptedText));
//    }

//    public static void main(String[] args) throws Exception {
//        KeyGenerator keyGenerator = KeyGenerator.getInstance(ENCRYPTION_ALGORITHM_IDENTIFIER);
//        keyGenerator.init(256);
//        SecretKey secretKey = keyGenerator.generateKey();
//        System.out.println("SecretKey implementation class : " + secretKey.getClass().getCanonicalName());
//        System.out.println("SecretKey algorithm : " + secretKey.getAlgorithm());
//        System.out.println("SecretKey encoded byte[] : " + secretKey.getEncoded());
//        System.out.println("SecretKey format : " + secretKey.getFormat());
//        SecretKeySpec x = new SecretKeySpec(secretKey.getEncoded(), ENCRYPTION_ALGORITHM_IDENTIFIER);
//        System.out.println(secretKey.equals(x));
//
//        SecureRandom secureRandom = new SecureRandom();
//        secureRandom = new SecureRandom(secureRandom.generateSeed(64));
//
//        System.out.println("Secure Random : " + secureRandom);
//        byte[] encryptedText = encryptPlainText("Hey Hey Hey!", secretKey, secureRandom);
//        System.out.println("Encrypted Text <" + encryptedText + ">");
//        System.out.println("Encrypted Text length : " + encryptedText.length);
//        String reconstitutedPlainText = decryptEncryptedText(secretKey, secureRandom, encryptedText);
//        System.out.println("Reconstituted plain text <" + reconstitutedPlainText + ">");
//    }
}