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
        HashMap<String, Integer> subjectsHash = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjectsHash.put(subject.subjectName(),
                        subjectsHash.getOrDefault(subject.subjectName(), 0) + subject.score());
            }
        }
        List<Label> subjectLabels = new LinkedList<>();
        for (String subjectName : subjectsHash.keySet()) {
            subjectLabels.add(new Label(subjectName,
                    (double) subjectsHash.get(subjectName) / pupils.size()));
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
        labels.sort(Comparator.reverseOrder());
        List<Label> temp = List.copyOf(labels);
        return temp.get(0);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        HashMap<String, Integer> subjectsHash = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjectsHash.put(subject.subjectName(),
                        subjectsHash.getOrDefault(subject.subjectName(), 0) + subject.score());
            }
        }
        List<Label> subjectLabels = new LinkedList<>();
        for (String subjectName : subjectsHash.keySet()) {
            subjectLabels.add(new Label(subjectName,
                    (double) subjectsHash.get(subjectName)));
        }
        subjectLabels.sort(Comparator.reverseOrder());
        List<Label> temp = List.copyOf(subjectLabels);
        return temp.get(0);
    }
}
