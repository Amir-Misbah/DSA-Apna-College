import java.util.*;

public class JobSequencing {
    static class Job {
        int deadLine;
        int profit;
        int id;
        
        Job(int i, int p, int d) {
            deadLine = d;
            profit = p;
            id = i;
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};
        ArrayList<Job> jobs = new ArrayList<>();
        
        // Creating job objects and adding them to the jobs list
        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][1], jobsInfo[i][0]));
        }

        // Sorting jobs by profit in descending order
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);
        
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadLine);
        }
        
        boolean[] slots = new boolean[maxDeadline];
        ArrayList<Integer> seq = new ArrayList<>();
        
        for (Job curr : jobs) {
            for (int j = Math.min(maxDeadline - 1, curr.deadLine - 1); j >= 0; j--) {
                if (!slots[j]) {
                    slots[j] = true;
                    seq.add(curr.id);
                    break;
                }
            }
        }

        System.out.println("max jobs = " + seq.size());
        System.out.println(seq);
    }
}
