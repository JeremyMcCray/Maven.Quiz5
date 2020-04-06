package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 * Jeremy McCray's work
 */
public class Student {

    Integer id;
    Double studyTime = 0.;

    public Student() {
        this.id = 0;
        this.studyTime= 0.;
    }

    public Student(Integer id) {
        this.id = id;
        this.studyTime = 0.;
    }

    public void learn(Double amountOfHours) {
        this.studyTime += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return this.studyTime;
    }


}
