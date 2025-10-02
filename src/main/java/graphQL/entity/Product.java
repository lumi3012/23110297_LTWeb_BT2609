package graphQL.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Integer quantity;

    @Column(name = "description", columnDefinition = "TEXT")
    private String desc;

    private float price;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

	public void setPrice(Double price2) {
		// TODO Auto-generated method stub
		
	}

	public void setPrice(float price2) {
		// TODO Auto-generated method stub
		
	}
}
