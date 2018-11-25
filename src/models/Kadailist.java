package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
    @NamedQuery(
            name = "AllTasklists",
            query = "select t from Tasklist as t"
            )
})
@Table(name = "tasks")
public class Kadailist {
    @Id
    @Column(name = "content", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String content;

    public String getContent(){
        return this.content;
    }
    public void setContent(String content){
        this.content = content;
    }
}
