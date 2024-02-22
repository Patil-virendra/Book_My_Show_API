package com.api.entitites;

import jakarta.persistence.*;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userId;

    private String userName;

    private String email;

    private String password;

    private Double phoneNo;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Booking> bookings =new ArrayList<>();

    @OneToMany(mappedBy = "user",cascade=CascadeType.ALL)
    private List<Payment> payment = new ArrayList<>();

//    @OneToMany(mappedBy="user",cascade = CascadeType.ALL)
//    private List<Review> review = new ArrayList<>();

    @OneToMany(mappedBy="user",cascade = CascadeType.ALL)
    private List<Ticket> ticket = new ArrayList<>();




    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

