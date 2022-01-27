package ma.fstt;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@RequiredArgsConstructor
@Data
@Document
public class Customer {
    @Id
    public String id;

    @Field
    public Long customerID;
    @Field
    public String genre;
    @Field
    public Integer age;
    @Field
    public Integer annual_Income;
    @Field
    public Integer spending_Score;
    @Field
    public Integer cluster;


    public Customer(String id, Long customerID, String genre, Integer age, Integer annual_Income, Integer spending_Score, Integer cluster) {
        this.id = id;
        this.customerID = customerID;
        this.genre = genre;
        this.age = age;
        this.annual_Income = annual_Income;
        this.spending_Score = spending_Score;
        this.cluster = cluster;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAnnual_Income() {
        return annual_Income;
    }

    public void setAnnual_Income(Integer annual_Income) {
        this.annual_Income = annual_Income;
    }

    public Integer getSpending_Score() {
        return spending_Score;
    }

    public void setSpending_Score(Integer spending_Score) {
        this.spending_Score = spending_Score;
    }

    public Integer getCluster() {
        return cluster;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }
}
