package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int sum = 0;
        int number = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
                number++;
            }
        }
        return (double) sum / number;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        Set<Label> labels = new HashSet<>();
        for (Pupil pupil : pupils) {
            int sum = 0;
            int number = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
                number++;
            }
            labels.add(new Label(pupil.name(), (double) sum / number));

        }
        return List.copyOf(labels);
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        HashMap<String, Integer> subjects = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjects.merge(subject.subjectName(), subject.score(), Integer::sum);
            }
        }

        List<Label> subjectLabels = new LinkedList<>();
        for (String subjectName : subjects.keySet()) {
            subjectLabels.add(new Label(subjectName,
                    (double) subjects.get(subjectName) / pupils.size()));
        }
        return List.copyOf(subjectLabels);
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int sum = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            labels.add(new Label(pupil.name(), sum));
        }
        Label maxScore = labels.get(0);
        for (Label label : labels) {
            if (label.compareTo(maxScore) > 0) {
                maxScore = label;
            }
        }
        return maxScore;
    }

    public static Label bestSubject(List<Pupil> pupils) {
        HashMap<String, Integer> subjects = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjects.merge(subject.subjectName(), subject.score(), Integer::sum);
            }
        }
        List<Label> subjectLabels = new LinkedList<>();
        for (String subjectName : subjects.keySet()) {
            subjectLabels.add(new Label(subjectName,
                    (double) subjects.get(subjectName)));
        }
        Label maxScore = subjectLabels.get(0);
        for (Label label : subjectLabels) {
            if (label.compareTo(maxScore) > 0) {
                maxScore = label;
            }
        }
        return maxScore;
    }
}
