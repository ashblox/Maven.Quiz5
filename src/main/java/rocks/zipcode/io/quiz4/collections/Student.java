package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {

    private Integer id;
    private Double totalStudyTime;

    public Student() {
        this(null);
        this.totalStudyTime = 0.0;
    }

    public Student(Integer id) {
        this.id = id;
        this.totalStudyTime = 0.0;
    }

    public void learn(Double amountOfHours) {
        totalStudyTime += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
