package demos.waguling.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by kikig on 2016-12-28.
 */
@Entity
@Table(name = "ORDERS")
public class Order {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    private Member member;      // 주문 회원

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems = new ArrayList<OrderItem>();

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "DELIVERY_ID")
    private Delivery delivery;  // 배송정보

    private Date orderDate;     // 주문시간

    @Enumerated(EnumType.STRING)
    private OrderStatus status; // 주문상태

    // 연관관계 메서드
}
