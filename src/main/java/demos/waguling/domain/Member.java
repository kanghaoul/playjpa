package demos.waguling.domain;

import com.sun.jndi.cosnaming.IiopUrl;

import javax.persistence.*;
import java.util.ArrayList;

/**
 * Created by kikig on 2016-12-28.
 */

@Entity
public class Member {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<Order>();


}
