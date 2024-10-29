package com.shop.entity.user;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {

    @Id
    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_name")
    private String userName;

    private String password;
    private String role;
    private String ssn;
    private String phone;
    private String addr;
    private String email;

    @Column(name = "reg_date")
    private LocalDate regDate;

    private String phone1;
    private String phone2;
    private String phone3;

    // 전화번호 파싱 로직 (phone 필드를 설정할 때 자동으로 처리)
    public void setPhone(String phone) {
        this.phone = phone;
        if (phone != null && !phone.isEmpty()) {
            String[] parts = phone.split("-");
            if (parts.length == 3) {
                this.phone1 = parts[0];
                this.phone2 = parts[1];
                this.phone3 = parts[2];
            }
        }
    }
}
