package com.mobile.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;

 @Entity(name="users")
public class UserEntity implements Serializable {


    @Serial
    private static final long serialVersionUID = -813609743029083029L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 50)
    private String firstName;

    @Column(nullable = false, length = 50)
    private String lastName;

    @Column(nullable = false, length = 120)
    private String email;

    private String encryptedPassword;
    private String emailVerificationToken;

    @Column(nullable=false, columnDefinition = "boolean default false")
    private Boolean emailVerificationStatus;

     public long getId() {
         return id;
     }

     public void setId(long id) {
         this.id = id;
     }

     public String getFirstName() {
         return firstName;
     }

     public void setFirstName(String firstName) {
         this.firstName = firstName;
     }

     public String getLastName() {
         return lastName;
     }

     public void setLastName(String lastName) {
         this.lastName = lastName;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public String getEncryptedPassword() {
         return encryptedPassword;
     }

     public void setEncryptedPassword(String encryptedPassword) {
         this.encryptedPassword = encryptedPassword;
     }

     public String getEmailVerificationToken() {
         return emailVerificationToken;
     }

     public void setEmailVerificationToken(String emailVerificationToken) {
         this.emailVerificationToken = emailVerificationToken;
     }

     public Boolean getEmailVerificationStatus() {
         return emailVerificationStatus;
     }

     public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
         this.emailVerificationStatus = emailVerificationStatus;
     }
 }
