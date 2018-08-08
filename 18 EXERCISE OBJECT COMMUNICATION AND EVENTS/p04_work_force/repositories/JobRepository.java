package p04_work_force.repositories;

import p04_work_force.interfaces.Job;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class JobRepository implements Repository{
    private Map<String, Job> jobs;

    public JobRepository() {

        this.jobs = new LinkedHashMap<>();
    }

    @Override
    public void addJob(Job job) {
        this.jobs.put(job.getName(), job);
    }

//    @Override
//    public Hero getHeroByName(String heroName) {
//        return this.heroes.get(heroName);
//    }

    @Override
    public Map<String, Job> getJobs() {
        return Collections.unmodifiableMap(this.jobs);
    }
}
