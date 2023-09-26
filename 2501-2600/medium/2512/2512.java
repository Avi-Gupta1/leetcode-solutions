import java.util.*;
class student implements Comparable<student>{
    int id;
    int marks;
    student(int id,int marks){
        this.id = id;
        this.marks = marks;
    }

    public int compareTo(student s) {
        if(s.marks == this.marks) {
            return this.id - s.id;
        }else {
            return s.marks - this.marks;
        }
    }
}
class Solution {
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        HashSet<String> positive = new HashSet<>(Arrays.asList(positive_feedback));
        HashSet<String> negative = new HashSet<>(Arrays.asList(negative_feedback));

        // Collections.add(positive, Arrays.toString(positive_feedback));
        // Collections.add(negative, Arrays.toString(negative_feedback));
        System.out.println(positive);
        System.out.println(negative);

        PriorityQueue<student> pq = new PriorityQueue<>();
        int stid = 0;
        for (String r: report) {
            String words = r;
            int count = 0;
            for (String word : words.split(" ")) {
                System.out.println(word);
                if(positive.contains(word)) {
                    count += 3;
                }
                if(negative.contains(word)) {
                    count -= 1;
                }
            }
            pq.add(new student(student_id[stid],count));
            stid++;
        }
        List<Integer> ans = new ArrayList<>();
        while(k > 0) {
            ans.add(pq.remove().id);
            k--;
        }
        return ans;
    }
}
