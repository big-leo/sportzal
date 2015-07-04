/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.at.programmers.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bogdan
 */
@Entity
@Table(name = "USERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u"),
    @NamedQuery(name = "Users.findByUserId", query
            = "SELECT u FROM Users u WHERE u.userId = :userId"),
    @NamedQuery(name = "Users.findByUserName", query
            = "SELECT u FROM Users u WHERE u.userName = :userName"),
    @NamedQuery(name = "Users.findByUserSurname", query
            = "SELECT u FROM Users u WHERE u.userSurname = :userSurname"),
    @NamedQuery(name = "Users.findByUserLogin", query
            = "SELECT u FROM Users u WHERE u.userLogin = :userLogin"),
    @NamedQuery(name = "Users.findByUserPasswd", query
            = "SELECT u FROM Users u WHERE u.userPasswd = :userPasswd"),
    @NamedQuery(name = "Users.findByUserEmail", query
            = "SELECT u FROM Users u WHERE u.userEmail = :userEmail")})
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "USER_ID")
    private Integer userId;
    @Size(max = 15)
    @Column(name = "USER_NAME")
    private String userName;
    @Size(max = 20)
    @Column(name = "USER_SURNAME")
    private String userSurname;
    @Size(max = 20)
    @Column(name = "USER_LOGIN")
    private String userLogin;
    @Size(max = 5)
    @Column(name = "USER_PASSWD")
    private String userPasswd;
    @Size(max = 40)
    @Column(name = "USER_EMAIL")
    private String userEmail;

    public Users() {
    }

    public Users(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.userId == null && other.userId != null) ||
                (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.at.programmers.entities.Users[ userId=" + userId + " ]";
    }
    
}
