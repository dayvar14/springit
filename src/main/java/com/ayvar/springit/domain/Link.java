package com.ayvar.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Link extends Auditable{

    @Id
    @GeneratedValue
    private long id;
    @NonNull
    private String title;
    @NonNull
    private String url;


    @OneToMany(mappedBy = "link")
    private List<Comment> comments = new ArrayList<Comment>();

    public void addComment(Comment comment){
        this.comments.add(comment);
    }

}
