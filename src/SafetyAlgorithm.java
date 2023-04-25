import java.util.Scanner;

import javax.swing.ComponentInputMap;

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
    private Boolean hasWork = true;
    // variables for the 
    // nested loop at step 2 
    private int process = 0;
    private int resource = 0;
    private Boolean jumped = false;

    public SafetyAlgorithm(){

    }

    // commendted out this one for testing
    /*public SafetyAlgorithm(int[] available, int[][] allocation, int[][] needs){
        // execute the safety algorithm here
        // step 1: let work be copy of available. finish to false for all processes i
        work = available.clone();
        processes = needs.length;
        resources = needs[0].length;
        finish = new Boolean[processes];
        for(int i = 0; i < processes; i++){
            finish[i] = false;
        }
        // step 2: search for any process which has not finished
        int worked = 0; // counts the processes which finished
        while(worked < processes){
            for(int i = 0; i < processes; i++){
                Boolean hasWork = true;
                for(int j = 0; j < resources; j++){
                    // if needs are not less than work, then no work to be done
                    if(needs[i][j] > work[j]){
                        hasWork = false;
                        break;
                    }
                }
                // step 3: if process needs work, give it one
                if(finish[i] == false && hasWork){
                    // assume it can be done
                    for(int j = 0; j < resources; j++){
                        work[j] += allocation[i][j];
                    }
                    // and show that it is done
                    finish[i] = true;
                }else{
                    // process is done
                    worked += 1;
                }
            }
        }
        safe = true; 
        // step 4: check if the system is in safe state
        for(int i=0; i < finish.length; i++){
            if(finish[i] == false){
                safe = false;
                break;
            }
        }
    }*/

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
                if(process < processes){
                    hasWork = true;
                    if(resource < resources){
        
                        // if needs are not less than work, then no work to be done
                        if(needs[process][resource] > work[resource]){
                            hasWork = false;
                        }
                        resource += 1;
                    }
                   
                    // jump and link only if inner loop is done
                    if(jumped){
                        // only increment process if jump and link is done
                        jumped = false;
                        process += 1;
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
                }else{
                // process is done
                worked += 1;

            }
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Processes: ");
        int processes = sc.nextInt();
        System.out.println("Number of Types of Resources:");
        int resources = sc.nextInt();
        // mock inputs
        int[] available = new int[resources];
        int[][] max = new int[processes][resources];
        int[][] allocation = new int[processes][resources];
        int[][] need = new int[processes][resources];
        System.out.println("Input max resources per process:");
        for(int i = 0; i < processes; i++){
            for(int j = 0; j < resources; j++){
                max[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input allocation of resources per process:");
        for(int i = 0; i < processes; i++){
            for(int j = 0; j < resources; j++){
                allocation[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input available resources:");
        for(int i = 0; i < resources; i++){
                available[i] = sc.nextInt();
        }
        // initialize need matrix
        for(int i = 0; i < processes; i++){
            for(int j = 0; j < resources; j++){
                need[i][j] = max[i][j] - allocation[i][j];
            }
        }
        // print inputs for testing
        System.out.println("Max matrix");
        for(int i = 0; i < processes; i++){
            for(int j = 0; j < resources; j++){
                System.out.print(max[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Allocation Matrix");
        for(int i = 0; i < processes; i++){
            for(int j = 0; j < resources; j++){
                System.out.print(allocation[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Need Matrix");
        for(int i = 0; i < processes; i++){
            for(int j = 0; j < resources; j++){
                System.out.print(need[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Available array:");
        for(int j = 0; j < resources; j++){
            System.out.print(available[j]+" ");
        }
        System.out.println();
        // initialize class
        SafetyAlgorithm sa = new SafetyAlgorithm();
        // simulate step by step
        while(sa.getStep() < 5){
            // show step
            int step = sa.getStep();
            System.out.println("Step: "+step);
            // add if-else for every sttep
            if(step == 1){
                 // simulate first
                 sa.simulate(available, allocation, need);
                
                System.out.print("Work: ");
                int[] work = sa.getWork();
                for(int i = 0; i < sa.getResources(); i++){
                    System.out.print(work[i]);
                }
                System.out.println("\nProcesses: "+sa.getProcesses());
                System.out.println("Resources: "+sa.getResources());
                Boolean[] finish = sa.getFinish();
                System.out.print("Finish: ");
                for(int i = 0; i < sa.getProcesses(); i++){
                    System.out.print(finish[i]);
                }
                System.out.println("\nGoing to step: "+sa.getStep());
            }else if(step == 2){
                int process = sa.getProcess();
                int resource = sa.getResource();
                int worked = sa.getWorked();
                int processesCopy = sa.getProcesses();
                System.out.println("worked: "+worked);
                System.out.println("Prcesses: "+processesCopy);
                System.out.println("Process: "+process);
                System.out.println("Resource: "+resource);
                
                // simulate first
                sa.simulate(available, allocation, need);

                int [][] needCopy = sa.getNeed();
                int [] work = sa.getWork();
                System.out.println("Need[process][resource]: "+needCopy[process][resource]);
                System.out.println("Work[resource]: "+work[resource]);
                // show result
                Boolean hasWork = sa.getHasWork();
                System.out.println("hasWork: "+hasWork);

                System.out.println("Going to step: "+sa.getStep());

            }else if(step == 3){
                Boolean[] finish = sa.getFinish();
                // int[][] allocationCopy = sa.getAllocation();
                 Boolean hasWork = sa.getHasWork();
                // int[] work = sa.getWork();
                 int process = sa.getProcess();
                 int resource = sa.getResource();
                 System.out.println("Process: "+process);
                 System.out.println("Resource: "+resource);
                 System.out.println("finish[process]"+finish[process]);
                 System.out.println("hasWork: "+hasWork);
                
                // simulate first
                sa.simulate(available, allocation, need);

                int worked = sa.getWorked();
                System.out.println("worked: "+worked);
                System.out.println("Going to step: "+sa.getStep());

            }else if(step == 4){
                 // simulate first
                 sa.simulate(available, allocation, need);

                Boolean[] finish = sa.getFinish();
                Boolean safe = sa.isSafe();
                System.out.print("Finish: ");
                for(int i = 0; i < sa.getProcesses(); i++){
                    System.out.print(finish[i]);
                }
                System.out.println("\nSafe: "+safe);
                System.out.println("Going to step: "+sa.getStep());
            }else{}
        }
        System.out.println("Simulation done!");
        
        //SafetyAlgorithm sa = new SafetyAlgorithm(available, allocation, need);
        System.out.println(sa.isSafe());
        sc.close();
    }
}