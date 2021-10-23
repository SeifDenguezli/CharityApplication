/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Hassan
 */
public class User {
    private int userId;
    private String name;
     private String city;
      private String gouvernerat;
       private String phone;
        private String mail;
         private String role;
         private float montant_donne;

    public User(int userId, String name, String city, String gouvernerat, String phone, String mail, String role, float montant_donne) {
        this.userId = userId;
        this.name = name;
        this.city = city;
        this.gouvernerat = gouvernerat;
        this.phone = phone;
        this.mail = mail;
        this.role = role;
        this.montant_donne = montant_donne;
    }

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGouvernerat() {
        return gouvernerat;
    }

    public void setGouvernerat(String gouvernerat) {
        this.gouvernerat = gouvernerat;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public float getMontant_donne() {
        return montant_donne;
    }

    public void setMontant_donne(float montant_donne) {
        this.montant_donne = montant_donne;
    }
         
    
}
