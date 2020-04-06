package rocks.zipcode.io.quiz4.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    Map<Student,Double> studyMap = new LinkedHashMap<>();

    public void enroll(Student student) {
        studyMap.put(student,student.getTotalStudyTime());
    }

    public Boolean isEnrolled(Student student) {
        return studyMap.containsKey(student);
    }

    public void lecture(double numberOfHours) {
        for (Student elem: studyMap.keySet()) {
            elem.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        return this.studyMap;
    }
}
