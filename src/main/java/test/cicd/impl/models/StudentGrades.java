package test.cicd.impl.models;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Component
public class StudentGrades {

    List<Double> mathGradeResults;

    public StudentGrades(){ System.out.println("\n\n=========================>inside ");}

    public StudentGrades(List<Double> mathGradeResults){
        this.mathGradeResults = mathGradeResults;
    }

    public  double addGradeResultatsForSingleClass(List<Double> grades){
        double result  = 0;
        for(double i : grades){
            result += i ;
        }
        return result;
    }

    public  double findGradePointAverage (List<Double> grades){
        int lenghtOfGrades = grades.size();
        double sum = addGradeResultatsForSingleClass(grades);
        double result = sum/lenghtOfGrades;

        // add Round function
        BigDecimal resultRound = BigDecimal.valueOf(result);
        resultRound  = resultRound.setScale(2, RoundingMode.HALF_UP);
        return resultRound.doubleValue();
    }

    public boolean isGradeGreater(double gradeOne, double gradeTwo){
        if(gradeOne > gradeTwo){ return true;}
        return false;}

    public  Object checkNull (Object obj){
        if(obj != null){
            return  obj;
        }
        return  null;
    }

    public  List<Double> getMathGradeResults(){ return mathGradeResults;}
    public  void setMathGradeResults(List<Double> mathGradeResults ){this.mathGradeResults = mathGradeResults;}

    @Override
    public  String toString(){ return "StudentGrades {" + "mathGradeResults=" + mathGradeResults + "}";}


}
