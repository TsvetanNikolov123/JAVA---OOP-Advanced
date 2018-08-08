package p04_work_force.repositories;


import p04_work_force.interfaces.Job;

import java.util.Map;

/**
 * Created by Hristo Skipernov on 09/05/2017.
 */
public interface Repository {

    void addJob(Job job);

    Map<String, Job> getJobs();

//
//    Hero getHeroByName(String heroName);
//

}
