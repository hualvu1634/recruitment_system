package huan.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "companies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // tên cty
    @Column(nullable = false)
    private String name;
    // mã số thuế
    @Column(name = "tax_code", unique = true, length = 50)
    private String taxCode;
    // trang web
    private String website;

    @Column(name = "logo_url", length = 500)
    private String logoUrl;

    @Column(name = "company_size")
    private Integer companySize;

    @Column(length = 255)
    private String description;
    @Column(length = 100)
    private String address;

}