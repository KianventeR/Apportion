import java.util.ArrayList;
public class SafetyAlgorithm{
    private int[] work;
    private Boolean[] finish;
    private int[][] need;
    private int[][] allocation;
    private Boolean safe;
    private int resources;
    private int processes;
    // initialize step to 1 already
    private int step = 1;
    // pre-initialize worked to 0
    private int worked = 0;
    // assume process has something to do
    private Boolean hasWork;
    // variables for the 
    // nested loop at step 2 
    private int process = 0;
    private int resource = 0;
    private Boolean jumped = false;
    private ArrayList<Integer> safetySequence = new ArrayList<>();

    public void simulate(int[] available, int[][] allocations, int[][] needs){
        // one by one execute the steps
        // 1. show step one in one if statement
        // 2 . show step two in another else statement
        // 3. show step three in another else statement
        // 4. show step four in another else statement
        Simulate:
        if(step == 1){
            // clone available into work for manipulating it
            work = available.clone();
            processes = needs.length;
            resources = needs[0].length;
            need = needs;
            allocation = allocations;
            // for step 2 variables, initialize them here
            worked = 0; // counts the processes which finished
            
            // set finish as a boolean array for each process
            // this tells the algorithm if there's a safe state
            // the boolean values for all elements of the array
            // must be true, and deadlock occurs if at least one
            // element has false as its value. 
            finish = new Boolean[processes];
            for(int i = 0; i < processes; i++){
                finish[i] = false;
            }
            // move to the next step
            step = 2;
        }else if(step == 2){
            // step 2: search for any process which has not finished
            if(worked < processes){
                // jump and link only if inner loop is done
                if(jumped){
                    // only increment process if jump and link is done
                    jumped = false;
                    process += 1;
                }

                if(process < processes){
                    // if only first exploring if it can be worked, assume true
                    if(resource == 0 && !jumped){
                        hasWork = true;
                        jumped = false;
                    }
                    if(resource < resources){
                        // if needs are not less than work, then no work to be done
                        if(needs[process][resource] > work[resource]){
                            hasWork = false;
                        }
                        resource += 1;   
                    }
                    
                    if(!jumped && resource == resources){
                        // if there is still work to assume done, go to step 3
                        step = 3;
                        resource = 0;
                        jumped = true;
                        break Simulate;
                    }
                }
                if(process == processes){
                    process = 0;
                }
            }else{
                // else, go to step 4 for validation
                step = 4;
            }
        }else if(step == 3){
            // step 3: if process needs work, give it one
            if(finish[process] == false && hasWork){
                // assume it can be done
                for(int j = 0; j < resources; j++){
                    work[j] += allocations[process][j];
                }
                // and show that it is done
                finish[process] = true;
                safetySequence.add(process);
            }else{
                // process is done
                worked += 1;
            }
            // add process here
            step = 2;
        }else if(step == 4){
            // assume the algorithm can return a safe state first 
            safe = true; 
            // step 4: check if the system is in safe state
            for(int i=0; i < finish.length; i++){
                if(finish[i] == false){
                    safe = false;
                    break;
                }
            }
            step = 5; // stop simulation code
        }else{}
    }

    public Boolean isSafe(){
        return safe;
    }

    public int[][] getAllocation() {
        return allocation;
    }

    public int[][] getNeed() {
        return need;
    }

    public Boolean[] getFinish() {
        return finish;
    }

    public int[] getWork() {
        return work;
    }

    public int getWorked() {
        return worked;
    }

    public int getProcess() {
        return process;
    }

    public int getProcesses() {
        return processes;
    }

    public Boolean getHasWork() {
        return hasWork;
    }

    public int getResource() {
        return resource;
    }

    public int getResources() {
        return resources;
    }

    public int getStep() {
        return step;
    }

    public int[] getSafetySequence() {
        return safetySequence.stream().mapToInt(Integer::intValue).toArray();
    }

    public void clearSequence(){
        safetySequence = new ArrayList<>();
    }
}