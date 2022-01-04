package com.example.springblog.entities;

import com.example.springblog.entities.baseEntity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tag")
@Getter
@Setter
public class Tag extends BaseEntity {

    private String name;

    @ManyToMany(mappedBy = "tags", cascade = CascadeType.ALL)
    private List<Post> posts;

    // авторизация и registration
    // удаление пользователя но не из базы(зашифровать или false)

}
