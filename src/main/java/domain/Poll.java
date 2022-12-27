package domain;

import javax.persistence.*;
import java.util.HashSet;

@Entity
public class Poll{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "POLL_ID")
    private Long id;

    @Column(name = "QUESTION")
    private String question;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "POLL_ID")
    @OrderBy
    private HashSet<Option> options = new HashSet<>();
    public Poll(){}
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public HashSet<Option> getOptions() {
        return options;
    }

    public void setOptions(HashSet<Option> options) {
        this.options = options;
    }

}
