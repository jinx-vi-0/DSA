// Job sequencing problem
// greedy approach

// given an array of jobs where every job has a deadline and profit if the job is finised before the deadline.
// It is also given that every job takes a single unit of time, so the minimum possible deadline for any job is 1.
// Maximize the total profit if only one job can be scheduled at a time.
import java.util.*;

public class Job_Sequencing {
    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int[][] jobInfo = {{4,20}, {1,10}, {1,40}, {1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0; i<jobInfo.length; i++) {
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        // sort the job objects
        Collections.sort(jobs, (obj1 , obj2) -> obj2.profit-obj1.profit);
        // descending order of profit

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i=0; i<jobs.size(); i++) {
            Job curr = jobs.get(i);
            if(curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("max jobs = " + seq.size());
        System.out.println(seq);
    }
}
