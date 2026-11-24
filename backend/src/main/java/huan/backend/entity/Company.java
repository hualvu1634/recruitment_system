package huan.backend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

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

    @Column(nullable = false)
    private String name;

    @Column(name = "tax_code", unique = true, length = 50)
    private String taxCode;

    private String website;

    @Column(name = "logo_url", length = 500)
    private String logoUrl;

    @Column(name = "company_size", length = 50)
    private String companySize;

    @Column(columnDefinition = "TEXT")
    private String description;

}