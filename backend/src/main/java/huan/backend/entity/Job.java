package huan.backend.entity;

import java.time.LocalDate;

import huan.backend.enums.City;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "jobs") // Nên đặt tên bảng rõ ràng đồng bộ với users, companies
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, length = 255)
    private String description;

    @Column(nullable = false, length = 255)
    private String requirements;

    @Column(nullable = false, length = 255)
    private String benefits;

    @Column(nullable = false)
    private String salary;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    @Builder.Default
    @Enumerated(EnumType.STRING)
    private City city = City.HANOI;

    @Column(nullable = false)
    private String type;

    private Double experience;

    @Column(name = "created_date", nullable = false)
    private LocalDate createdDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;
}